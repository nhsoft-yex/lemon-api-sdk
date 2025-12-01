package com.nhsoft.neptune.api.internal.auth;

import com.nhsoft.neptune.ApiCloudException;
import com.nhsoft.neptune.api.internal.util.Asserts;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @auther nhsoft.yex
 */
@Slf4j
public class TokenManager {

    private final AuthService authService;

    private final TokenStorage tokenStorage;

    private final ScheduledExecutorService scheduledExecutor;

    private final ConcurrentHashMap<String/*商户号*/, TokenInfo> TOKEN_CACHE = new ConcurrentHashMap<>();

    public TokenManager(TokenStorage tokenStorage, AuthService authService) {
        this.tokenStorage = tokenStorage;
        this.authService = authService;
        scheduledExecutor = Executors.newSingleThreadScheduledExecutor(
                r -> {
                    Thread t = new Thread(r, "Token-Cleanup-Thread");
                    t.setDaemon(true); // 设置为守护线程
                    return t;
                }
        );
        startUp();
    }

    private void startUp() {
        scheduledExecutor.scheduleWithFixedDelay(() -> {
            try {
                TOKEN_CACHE.forEach((merchantId, tokenInfo) -> {
                    if (tokenInfo != null && tokenInfo.expired()) {
                        refreshToken(tokenInfo);
                    }
                });
            } catch (Exception e) {
                log.error("Token cleanup task error: {}", e.getMessage(), e);
            }
        }, 10, 10, TimeUnit.MINUTES); // 延迟10分钟开始，每10分钟执行一次
    }

    public TokenInfo getToken(String merchantId) {
        TokenInfo tokenInfo = TOKEN_CACHE.get(merchantId);
        if (tokenInfo != null && !tokenInfo.expired()) {
            return tokenInfo;
        }
        //持久化获取
        tokenInfo = tokenStorage.get(merchantId);
        if (tokenInfo != null && !tokenInfo.expired()) {
            TOKEN_CACHE.put(merchantId, tokenInfo);
            return tokenInfo;
        }
        Asserts.notNull(tokenInfo, () -> new ApiCloudException(400, "商户号" + merchantId + "token已过期，需要商户重新授权！"));
        //刷新token
        return refreshToken(tokenInfo);
    }

    private TokenInfo refreshToken(TokenInfo tokenInfo) {
        ApiCloudOpenAuthTokenAppRequest request = new ApiCloudOpenAuthTokenAppRequest();
        ApiCloudOpenAuthTokenAppModel model = new ApiCloudOpenAuthTokenAppModel();
        model.setGrantType("refresh_token");
        model.setRefreshToken(tokenInfo.getRefreshToken());
        request.setBizModel(model);
        ApiCloudOpenAuthTokenAppResponse response = authService.accessToken(request);
        return storeToken(response);

    }

    private TokenInfo storeToken(ApiCloudOpenAuthTokenAppResponse response) {
        TokenInfo latestToken = new TokenInfo(
                response.getMerchantId(),
                response.getAccessToken(),
                response.getRefreshToken(),
                response.getExpiresIn() * 1000 + response.getStartTimestamp()
        );
        tokenStorage.store(latestToken);
        TOKEN_CACHE.put(response.getMerchantId(), latestToken);
        return latestToken;
    }

    public TokenInfo accessToken(String code, String redirectUrl) {
        ApiCloudOpenAuthTokenAppRequest request = new ApiCloudOpenAuthTokenAppRequest();
        ApiCloudOpenAuthTokenAppModel model = new ApiCloudOpenAuthTokenAppModel();
        model.setGrantType("authorization_code");
        model.setCode(code);
        model.setRedirectUri(redirectUrl);
        request.setBizModel(model);
        ApiCloudOpenAuthTokenAppResponse response = authService.accessToken(request);
        return storeToken(response);
    }

    public void removeToken(String merchantId) {
        TOKEN_CACHE.remove(merchantId);
        tokenStorage.remove(merchantId);
    }

    public void close() {
        //缓存清理
        TOKEN_CACHE.clear();
        //线程池关闭
        if (scheduledExecutor != null && !scheduledExecutor.isShutdown()) {
            // 停止接受新任务
            scheduledExecutor.shutdown();
            try {
                // 等待最多 30 秒让现有任务完成
                if (!scheduledExecutor.awaitTermination(30, TimeUnit.SECONDS)) {
                    // 如果等待超时，强制关闭
                    scheduledExecutor.shutdownNow();
                    // 再等待一段时间让任务响应中断
                    if (!scheduledExecutor.awaitTermination(10, TimeUnit.SECONDS)) {
                        System.err.println("ScheduledExecutorService did not terminate");
                    }
                }
            } catch (InterruptedException e) {
                // 重新中断当前线程
                Thread.currentThread().interrupt();
                // 强制关闭
                scheduledExecutor.shutdownNow();
            }
        }
    }
}

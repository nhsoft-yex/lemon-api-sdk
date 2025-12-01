package com.nhsoft.neptune.api.internal.auth;

import com.nhsoft.neptune.ApiCloudException;
import com.nhsoft.neptune.api.internal.http.DefaultHttpClient;
import com.nhsoft.neptune.api.internal.http.HttpClient;
import com.nhsoft.neptune.api.internal.util.ApiCloudHashMap;
import com.nhsoft.neptune.api.internal.util.ApiCloudUtils;
import com.nhsoft.neptune.api.internal.util.JsonUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @auther nhsoft.yex
 * @description 开放平台网关授权服务
 */
public class AuthService {

    private final String appId;

    private final String secret;

    private final String authUrl;

    private final HttpClient httpClient;


    public AuthService(AuthConfig config) {
        this.appId = config.getAppId();
        this.secret = config.getSecret();
        this.authUrl = config.getAuthUrl();
        this.httpClient = config.getHttpClient() == null ? new DefaultHttpClient() : config.getHttpClient();
    }

    /**
     * @param request 获取令牌 或者 刷新令牌
     * @return 令牌信息
     */
    public ApiCloudOpenAuthTokenAppResponse accessToken(ApiCloudOpenAuthTokenAppRequest request) {
        String url = authUrl + request.getApiMethodName();
        ApiCloudHashMap params = ApiCloudUtils.buildTextParams(request.getBizModel());

        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Authorization", "Basic ".concat(Base64.getEncoder().encodeToString(String.join(":", appId, secret).getBytes(StandardCharsets.UTF_8))));

        Function<String, ApiCloudOpenAuthTokenAppResponse> decoder = json -> {
            ApiCloudOpenAuthTokenAppResponse response = JsonUtil.fromJson(json, ApiCloudOpenAuthTokenAppResponse.class);
            if (!response.isSuccess()) {
                throw new ApiCloudException(400, response.getErrorDescription());
            }
            return response;
        };
        long startTime = System.currentTimeMillis();
        try {
            HttpClient.HttpResponse response = httpClient.postForm(url, params, headers);
            handleError(response);
            ApiCloudOpenAuthTokenAppResponse appResponse = decoder.apply(response.getBody());
            appResponse.setEndTimestamp(System.currentTimeMillis());
            appResponse.setStartTimestamp(startTime);
            return appResponse;
        } catch (IOException e) {
            throw new ApiCloudException(e.getMessage());
        }
    }

    private void handleError(HttpClient.HttpResponse response) {
        if ((response.getStatusCode() >= 200 && response.getStatusCode() < 300) || response.getStatusCode() == 400) {
            return;
        }
        if (response.getStatusCode() == 401) {
            throw new ApiCloudException(401, "授权失败,请检查appId和secret！");
        } else {
            throw new ApiCloudException(400, "授权服务暂不可用,请稍后重试！");
        }
    }
}
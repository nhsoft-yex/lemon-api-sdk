package com.nhsoft.neptune.api.internal.auth;

import lombok.Data;

/**
 * @auther nhsoft.yex
 */
@Data
public class TokenInfo {
    /**
     * 商户号
     */
    private String merchantId;
    /**
     * 访问token
     */
    private String accessToken;
    /**
     * 刷新token
     */
    private String refreshToken;
    /**
     * 过期时间戳
     */
    private Long expireTime;

    public TokenInfo() {
    }

    public TokenInfo(String merchantId, String accessToken, String refreshToken, Long expireTime) {
        this.merchantId = merchantId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expireTime = expireTime;
    }

    /**
     * 是否过期
     *
     * @return true: 过期
     */
    public Boolean expired() {
        return System.currentTimeMillis() > expireTime;
    }
}

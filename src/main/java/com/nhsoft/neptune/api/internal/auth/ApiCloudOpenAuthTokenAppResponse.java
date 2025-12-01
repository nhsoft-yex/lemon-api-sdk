package com.nhsoft.neptune.api.internal.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nhsoft.neptune.ApiCloudObject;
import lombok.Data;

/**
 * @auther nhsoft.yex
 */
@Data
public class ApiCloudOpenAuthTokenAppResponse extends ApiCloudObject {
    /**
     * 错误码
     */
    private String error;

    /**
     * 错误描述
     */
    private String errorDescription;

    /**
     * 应用授权令牌
     */
    private String accessToken;

    /**
     * 令牌类型
     * example: bearer
     */
    private String tokenType;

    /**
     * 刷新令牌
     */
    private String refreshToken;

    /**
     * 过期时间
     * example: 3600 (单位秒)
     */
    private Long expiresIn;

    /**
     * 应用授权令牌
     */
    private String appAuthToken;

    /**
     * 刷新令牌
     */
    private String appRefreshToken;

    /**
     * 授权商户的appid
     */
    @JsonProperty("Nhsoft-Allpay-App-Id")
    private String authAppId;

    /**
     * 授权商户的商户id
     */
    @JsonProperty("Nhsoft-Merchant-Id")
    private String merchantId;

    public Boolean isSuccess() {
        return error == null;
    }
}

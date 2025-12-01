package com.nhsoft.neptune.api.internal.auth;

import com.nhsoft.neptune.api.internal.http.HttpClient;
import lombok.Data;

/**
 * @auther nhsoft.yex
 */
@Data
public class AuthConfig {
    /**
     * 应用id
     */
    private String appId;

    /**
     * 应用密钥
     */
    private String secret;

    /**
     * 授权服务地址
     */
    private String authUrl = "https://cloud.nhsoft.cn/authserver";
    /**
     * 自定义HTTP客户端
     */
    private HttpClient httpClient;
}

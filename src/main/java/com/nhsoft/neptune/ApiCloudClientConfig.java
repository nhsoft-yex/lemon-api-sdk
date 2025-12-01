package com.nhsoft.neptune;

import com.nhsoft.neptune.api.internal.http.HttpClient;
import lombok.Data;

/**
 * @author: xin.ye
 * @description:
 * @Date: 2025/11/5 20:46
 */
@Data
public class ApiCloudClientConfig {
    /**
     * 开放平台app_id
     */
    private String appId;
    /**
     * 开放平台密钥
     */
    private String secret;
    /**
     * 开放平台网关
     */
    private String openApiUrl = "https://cloud.nhsoft.cn/api";

    /**
     * 自定义HTTP客户端
     */
    private HttpClient httpClient;
}
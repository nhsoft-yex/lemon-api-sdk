package com.nhsoft.neptune;

/**
 * ApiCloud客户端接口
 */
public interface ApiCloudClient {
    
    /**
     * 执行API请求
     * 
     * @param request API请求
     * @param accessToken 访问令牌
     * @param <T> 请求参数类型
     * @param <R> 响应结果类型
     * @return API响应结果
     * @throws ApiCloudException API异常
     */
    <T, R> R execute(ApiCloudRequest<T, R> request, String accessToken) throws ApiCloudException;
}
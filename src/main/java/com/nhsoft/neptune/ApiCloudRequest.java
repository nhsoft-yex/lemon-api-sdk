package com.nhsoft.neptune;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 请求接口
 *
 * @param
 */
public interface ApiCloudRequest<T,R> {

    /**
     * httpMethod: GET, POST,DELETE,PUT
     *
     * @return http请求类型
     */
    String method();

    /**
     * 获取TOP的API名称。
     *
     * @return API名称
     */
    String getApiMethodName();

    T getBizModel();

    void setBizModel(T t);

    /**
     * 获取响应的 TypeReference，用于泛型反序列化
     */
    TypeReference<ApiCloudResponse<R>> getResponseTypeReference();
}
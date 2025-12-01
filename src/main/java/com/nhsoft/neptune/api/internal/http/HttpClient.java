package com.nhsoft.neptune.api.internal.http;

import lombok.Getter;

import java.io.IOException;
import java.util.Map;

/**
 * HTTP客户端接口，用于发送HTTP请求
 * SDK使用者可以提供自己的实现来替换默认的OkHttp实现
 */
public interface HttpClient {

    /**
     * 发送GET请求
     *
     * @param url     请求URL
     * @param params  请求参数
     * @param headers 请求头
     * @return 响应结果
     * @throws IOException IO异常
     */
    HttpResponse get(String url, Map<String, String> params, Map<String, String> headers) throws IOException;

    /**
     * 发送POST请求
     *
     * @param url     请求URL
     * @param body    请求体
     * @param headers 请求头
     * @return 响应结果
     * @throws IOException IO异常
     */
    HttpResponse post(String url, String body, Map<String, String> headers) throws IOException;

    /**
     * 发送POST请求
     * @param url 请求URL
     * @param params 请求参数
     * @param headers 请求头
     * @return 响应结果
     * @throws IOException
     */
    HttpResponse postForm(String url, Map<String, String> params, Map<String, String> headers) throws IOException;

    /**
     * HTTP响应封装
     */
    @Getter
    class HttpResponse {
        private final int statusCode;
        private final String body;
        private final Map<String, String> headers;

        public HttpResponse(int statusCode, String body, Map<String, String> headers) {
            this.statusCode = statusCode;
            this.body = body;
            this.headers = headers;
        }

    }
}
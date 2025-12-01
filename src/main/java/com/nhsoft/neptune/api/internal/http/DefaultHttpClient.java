package com.nhsoft.neptune.api.internal.http;

import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 默认HTTP客户端实现，基于OkHttp
 * 当使用者不提供自定义HTTP客户端时使用此实现
 * 
 * 注意：使用者需要自行添加OkHttp依赖到项目中
 */
public class DefaultHttpClient implements HttpClient {
    
    private final OkHttpClient client;
    
    public DefaultHttpClient() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(64);
        dispatcher.setMaxRequestsPerHost(64);
        client = new OkHttpClient.Builder()
                .dispatcher(dispatcher)
                .connectTimeout(3, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
    }
    
    /**
     * 使用自定义的OkHttpClient构造函数
     * @param client 自定义的OkHttpClient实例
     */
    public DefaultHttpClient(OkHttpClient client) {
        this.client = client != null ? client : new OkHttpClient.Builder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
    }
    
    @Override
    public HttpResponse get(String url, Map<String, String> params, Map<String, String> headers) throws IOException {
        String fullUrl = buildUrlWithParams(url, params);
        Request request = new Request.Builder()
                .url(fullUrl)
                .headers(Headers.of(headers))
                .get()
                .build();
        
        try (Response response = client.newCall(request).execute()) {
            return new HttpResponse(
                    response.code(),
                    response.body() != null ? response.body().string() : "",
                    headersToMap(response.headers())
            );
        }
    }
    
    @Override
    public HttpResponse post(String url, String body, Map<String, String> headers) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .headers(Headers.of(headers))
                .post(RequestBody.create(body, MediaType.get("application/json; charset=utf-8")))
                .build();
        
        try (Response response = client.newCall(request).execute()) {
            return new HttpResponse(
                    response.code(),
                    response.body() != null ? response.body().string() : "",
                    headersToMap(response.headers())
            );
        }
    }
    
    @Override
    public HttpResponse postForm(String url, Map<String, String> params, Map<String, String> headers) throws IOException {
        // 构建表单请求体
        FormBody.Builder formBuilder = new FormBody.Builder();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formBuilder.add(entry.getKey(), entry.getValue());
            }
        }
        
        Request request = new Request.Builder()
                .url(url)
                .headers(Headers.of(headers))
                .post(formBuilder.build())
                .build();
        
        try (Response response = client.newCall(request).execute()) {
            return new HttpResponse(
                    response.code(),
                    response.body() != null ? response.body().string() : "",
                    headersToMap(response.headers())
            );
        }
    }
    
    private String buildUrlWithParams(String url, Map<String, String> params) {
        if (params == null || params.isEmpty()) {
            return url;
        }
        
        StringBuilder sb = new StringBuilder(url);
        sb.append("?");
        
        boolean first = true;
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (!first) {
                sb.append("&");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
            first = false;
        }
        
        return sb.toString();
    }
    
    private Map<String, String> headersToMap(Headers headers) {
        Map<String, String> headersMap = new HashMap<>();
        for (int i = 0; i < headers.size(); i++) {
            headersMap.put(headers.name(i), headers.value(i));
        }
        return headersMap;
    }
}
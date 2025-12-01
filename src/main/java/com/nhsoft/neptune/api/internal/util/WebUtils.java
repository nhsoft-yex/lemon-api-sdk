package com.nhsoft.neptune.api.internal.util;

import okhttp3.*;

import java.io.IOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @auther nhsoft.yex
 */
public class WebUtils {
    /**
     * http引擎
     */
    private static final OkHttpClient client;

    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(64);
        dispatcher.setMaxRequestsPerHost(64);
        client = new OkHttpClient()
                .newBuilder()
                .dispatcher(dispatcher)
                .connectTimeout(Duration.of(3, ChronoUnit.SECONDS))
                .readTimeout(Duration.of(30, ChronoUnit.SECONDS)) //默认设置30s
                .build();
    }

    /**
     * @param url          接口
     * @param params       参数
     * @param headers      请求头
     * @param errorHandler 错误处理
     * @return 数据
     * @throws IOException 抛出IO异常
     */
    public static String doGet(String url,
                               Map<String, String> params,
                               Map<String, String> headers,
                               Consumer<Response> errorHandler) throws IOException {
        Request request = new Request.Builder()
                .url(url + buildQuery(params))
                .headers(Headers.of(headers))
                .build();
        try (Response response = client.newCall(request).execute()) {
            errorHandler.accept(response);
            return response.body().string();
        }
    }

    /**
     * @param url          接口
     * @param params       参数
     * @param headers      请求头
     * @param errorHandler 错误处理
     * @return 数据
     * @throws IOException 抛出IO异常
     */
    public static String doPost(String url,
                                Map<String, String> params,
                                Map<String, String> headers,
                                Consumer<Response> errorHandler) throws IOException {
        String json = JsonUtil.toJson(params);
        Request request = new Request.Builder()
                .url(url)
                .headers(Headers.of(headers))
                .post(RequestBody.create(json, MediaType.parse("application/json; charset=utf-8")))
                .build();
        try (Response response = client.newCall(request).execute()) {
            errorHandler.accept(response);
            return response.body().string();
        }
    }

    /**
     * @param url          接口
     * @param params       参数
     * @param headers      请求头
     * @param errorHandler 错误处理
     * @param decoder      解码器
     * @param <T>          返回类型
     * @return 解码后的数据
     * @throws IOException 抛出IO异常
     */
    public static <T> T doGet(String url,
                              Map<String, String> params,
                              Map<String, String> headers,
                              Consumer<Response> errorHandler,
                              Function<String, T> decoder) throws IOException {
        Request request = new Request.Builder()
                .url(url + buildQuery(params))
                .headers(Headers.of(headers))
                .get()
                .build();
        try (Response response = client.newCall(request).execute()) {
            errorHandler.accept(response);
            String json = response.body().string();
            return decoder.apply(json);
        }
    }

    /**
     * @param url          接口
     * @param t            参数
     * @param headers      请求头
     * @param errorHandler 错误处理
     * @param decoder      解码器
     * @param <T>          返回类型
     * @return 解码后的数据
     * @throws IOException 抛出IO异常
     */
    public static <T, R> R doPost(String url,
                                  T t,
                                  Map<String, String> headers,
                                  Consumer<Response> errorHandler,
                                  Function<String, R> decoder) throws IOException {
        String json = JsonUtil.toPrettyJson(t);
        Request request = new Request.Builder()
                .url(url)
                .headers(Headers.of(headers))
                .post(RequestBody.create(json, MediaType.parse("application/json; charset=utf-8")))
                .build();
        try (Response response = client.newCall(request).execute()) {
            errorHandler.accept(response);
            String responseJson = response.body().string();
            return decoder.apply(responseJson);
        }
    }

    /**
     * @param url          接口
     * @param params       参数
     * @param headers      请求头
     * @param errorHandler 错误处理
     * @param decoder      解码器
     * @param <T>          返回类型
     * @return 解码后的数据
     * @throws IOException 抛出IO异常
     */
    public static <T> T doPostForForm(String url,
                                      Map<String, String> params,
                                      Map<String, String> headers,
                                      Consumer<Response> errorHandler,
                                      Function<String, T> decoder) throws IOException {
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
            errorHandler.accept(response);
            String responseJson = response.body().string();
            return decoder.apply(responseJson);
        }
    }

    private static String buildQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder("?");
        Set<Map.Entry<String, String>> entries = params.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
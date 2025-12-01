package com.nhsoft.neptune;


import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.api.internal.http.DefaultHttpClient;
import com.nhsoft.neptune.api.internal.http.HttpClient;
import com.nhsoft.neptune.api.internal.util.ApiCloudUtils;
import com.nhsoft.neptune.api.internal.util.JacksonException;
import com.nhsoft.neptune.api.internal.util.JsonUtil;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @auther nhsoft.yex
 */
public class DefaultApiCloudClient implements ApiCloudClient {
    /**
     * 开放平台网关
     */
    private final String openApiUrl;

    /**
     * HTTP客户端
     */
    private final HttpClient httpClient;

    public DefaultApiCloudClient(ApiCloudClientConfig config) {
        this.openApiUrl = config.getOpenApiUrl();
        this.httpClient = config.getHttpClient() != null ? config.getHttpClient() : new DefaultHttpClient();
    }

    @Override
    public <T, R> R execute(ApiCloudRequest<T, R> request, String accessToken) throws ApiCloudException {
        Map<String, String> headers = new LinkedHashMap<>();
        String url = openApiUrl + request.getApiMethodName();
        headers.put("Authorization", "Bearer ".concat(accessToken));

        Function<String, R> decoder = json -> {
            TypeReference<ApiCloudResponse<R>> responseTypeReference = request.getResponseTypeReference();
            ApiCloudResponse<R> apiCloudResponse;
            try {
                apiCloudResponse = JsonUtil.fromJson(json, responseTypeReference);
            } catch (JacksonException e) {
                throw new ApiCloudException("返回值解析错误: " + e.getCause().getMessage());
            }
            if (!apiCloudResponse.isSuccess()) {
                throw new ApiCloudException(apiCloudResponse.getMsg());
            }
            return apiCloudResponse.getResult();
        };

        try {
            if ("GET".equals(request.method())) {
                Map<String, String> params = ApiCloudUtils.buildTextParams(request.getBizModel());
                HttpClient.HttpResponse response = httpClient.get(url, params, headers);
                handleError(response);
                return decoder.apply(response.getBody());
            } else {
                String json = JsonUtil.toPrettyJson(request.getBizModel());
                headers.put("Content-Type", "application/json;charset=utf-8");
                HttpClient.HttpResponse response = httpClient.post(url, json, headers);
                handleError(response);
                return decoder.apply(response.getBody());
            }
        } catch (IOException e) {
            throw new ApiCloudException(e.getMessage());
        }
    }

    private void handleError(HttpClient.HttpResponse response) {
        if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
            return;
        }

        if (response.getStatusCode() == 400) {
            throw new ApiCloudException(ApiCloudErrorEnum.API_UNAUTHORIZED);
        } else if (response.getStatusCode() == 401) {
            throw new ApiCloudException(ApiCloudErrorEnum.TOKEN_INVALID);
        } else if (response.getStatusCode() == 429) {
            throw new ApiCloudException(ApiCloudErrorEnum.TOO_MANY_REQUESTS);
        } else if (response.getStatusCode() == 504) {
            throw new ApiCloudException(ApiCloudErrorEnum.API_TIME_OUT);
        } else if (response.getStatusCode() == 503) {
            throw new ApiCloudException(ApiCloudErrorEnum.SERVICE_UNAVAILABLE);
        } else {
            throw new ApiCloudException("HTTP Error: " + response.getStatusCode());
        }
    }
}
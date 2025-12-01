package com.nhsoft.neptune.api.internal.auth;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;

/**
 * @auther nhsoft.yex
 */
public class ApiCloudOpenAuthTokenAppRequest implements ApiCloudRequest<ApiCloudOpenAuthTokenAppModel, ApiCloudOpenAuthTokenAppResponse> {


    private ApiCloudOpenAuthTokenAppModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/oauth/token";
    }


    @Override
    public ApiCloudOpenAuthTokenAppModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ApiCloudOpenAuthTokenAppModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ApiCloudOpenAuthTokenAppResponse>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ApiCloudOpenAuthTokenAppResponse>>() {
        };
    }
}
package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserReadDTOModel;

import com.nhsoft.neptune.api.domain.AppUserResponseDTOModel;

import java.util.*;

/**
 * userinfoRead请求类
 * 用户信息读取
 */
public class BasicUserReadRequest implements ApiCloudRequest<AppUserReadDTOModel, AppUserResponseDTOModel> {

    private AppUserReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.user.read";
    }

    @Override
    public AppUserReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AppUserReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AppUserResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AppUserResponseDTOModel>>() {};
    }

}

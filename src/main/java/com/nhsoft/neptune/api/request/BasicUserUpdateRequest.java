package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserUpdateDTOModel;

import com.nhsoft.neptune.api.domain.AppUserResponseDTOModel;

import java.util.*;

/**
 * updateAppUser请求类
 * 用户修改
 */
public class BasicUserUpdateRequest implements ApiCloudRequest<AppUserUpdateDTOModel, AppUserResponseDTOModel> {

    private AppUserUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.user.update";
    }

    @Override
    public AppUserUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AppUserUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AppUserResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AppUserResponseDTOModel>>() {};
    }

}

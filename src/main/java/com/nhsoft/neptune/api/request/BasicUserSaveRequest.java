package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserSaveDTOModel;

import com.nhsoft.neptune.api.domain.AppUserResponseDTOModel;

import java.util.*;

/**
 * saveAppUser请求类
 * 用户新增
 */
public class BasicUserSaveRequest implements ApiCloudRequest<AppUserSaveDTOModel, AppUserResponseDTOModel> {

    private AppUserSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.user.save";
    }

    @Override
    public AppUserSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AppUserSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AppUserResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AppUserResponseDTOModel>>() {};
    }

}

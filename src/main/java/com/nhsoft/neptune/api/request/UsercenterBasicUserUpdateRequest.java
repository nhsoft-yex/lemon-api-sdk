package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicUserUpdateDTOModel;

import com.nhsoft.neptune.api.domain.UserBasicUserVOModel;

import java.util.*;

/**
 * updateBasicCompanyUser请求类
 * 用户编辑
 */
public class UsercenterBasicUserUpdateRequest implements ApiCloudRequest<UserBasicUserUpdateDTOModel, UserBasicUserVOModel> {

    private UserBasicUserUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.user.update";
    }

    @Override
    public UserBasicUserUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicUserUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserBasicUserVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserBasicUserVOModel>>() {};
    }

}

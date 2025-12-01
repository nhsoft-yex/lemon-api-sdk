package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicUserSaveDTOModel;

import com.nhsoft.neptune.api.domain.UserBasicUserVOModel;

import java.util.*;

/**
 * saveBasicCompanyUser请求类
 * 用户新增
 */
public class UsercenterBasicUserSaveRequest implements ApiCloudRequest<UserBasicUserSaveDTOModel, UserBasicUserVOModel> {

    private UserBasicUserSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.user.save";
    }

    @Override
    public UserBasicUserSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicUserSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserBasicUserVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserBasicUserVOModel>>() {};
    }

}

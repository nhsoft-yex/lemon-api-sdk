package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicUserFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserBasicUserVOModel;

import com.nhsoft.neptune.api.domain.UserBasicUserVOModel;

import java.util.*;

/**
 * findBasicUser请求类
 * 用户查询
 */
public class UsercenterBasicUserFindRequest implements ApiCloudRequest<UserBasicUserFindDTOModel, List<UserBasicUserVOModel>> {

    private UserBasicUserFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.user.find";
    }

    @Override
    public UserBasicUserFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicUserFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserBasicUserVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserBasicUserVOModel>>>() {};
    }

}

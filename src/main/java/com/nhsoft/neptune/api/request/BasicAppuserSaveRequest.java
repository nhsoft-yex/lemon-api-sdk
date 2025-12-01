package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserSaveDTOModel;

import java.util.*;

/**
 * saveAppUser_1请求类
 * 前台用户信息新增
 */
public class BasicAppuserSaveRequest implements ApiCloudRequest<AppUserSaveDTOModel, Integer> {

    private AppUserSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.appuser.save";
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
    public TypeReference<ApiCloudResponse<Integer>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Integer>>() {};
    }

}

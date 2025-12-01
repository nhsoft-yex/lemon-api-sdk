package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserUpdateDTOModel;

import java.util.*;

/**
 * updateAppUser_1请求类
 * 前台用户信息修改
 */
public class BasicAppuserUpdateRequest implements ApiCloudRequest<AppUserUpdateDTOModel, Integer> {

    private AppUserUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.appuser.update";
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
    public TypeReference<ApiCloudResponse<Integer>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Integer>>() {};
    }

}

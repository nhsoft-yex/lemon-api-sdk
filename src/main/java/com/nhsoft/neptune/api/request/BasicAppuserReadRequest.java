package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserReadDTOModel;

import com.nhsoft.neptune.api.domain.AppUserVOModel;

import java.util.*;

/**
 * readAppUser请求类
 * 前台用户信息读取
 */
public class BasicAppuserReadRequest implements ApiCloudRequest<AppUserReadDTOModel, AppUserVOModel> {

    private AppUserReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.appuser.read";
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
    public TypeReference<ApiCloudResponse<AppUserVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AppUserVOModel>>() {};
    }

}

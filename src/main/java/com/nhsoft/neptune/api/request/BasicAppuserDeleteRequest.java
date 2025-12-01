package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserReadDTOModel;

import java.util.*;

/**
 * deleteAppUser_1请求类
 * 前台用户信息删除
 */
public class BasicAppuserDeleteRequest implements ApiCloudRequest<AppUserReadDTOModel, Void> {

    private AppUserReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.appuser.delete";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

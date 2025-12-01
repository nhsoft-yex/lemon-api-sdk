package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AppUserDeleteDTOModel;

import java.util.*;

/**
 * deleteAppUser请求类
 * 用户删除
 */
public class BasicUserDeleteRequest implements ApiCloudRequest<AppUserDeleteDTOModel, Void> {

    private AppUserDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.user.delete";
    }

    @Override
    public AppUserDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AppUserDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

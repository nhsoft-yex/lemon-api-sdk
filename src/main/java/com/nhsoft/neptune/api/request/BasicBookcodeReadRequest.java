package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SystemBookV2DTOModel;

import java.util.*;

/**
 * readBookInfo请求类
 * 账套信息读取
 */
public class BasicBookcodeReadRequest implements ApiCloudRequest<Void, SystemBookV2DTOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.bookcode.read";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SystemBookV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SystemBookV2DTOModel>>() {};
    }

}

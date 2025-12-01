package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosItemParamV2DTOModel;

import java.util.*;

/**
 * readPosItemParam请求类
 * 基本参数读取
 */
public class BasicPositemparamReadRequest implements ApiCloudRequest<Void, PosItemParamV2DTOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.positemparam.read";
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
    public TypeReference<ApiCloudResponse<PosItemParamV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemParamV2DTOModel>>() {};
    }

}

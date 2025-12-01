package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerCardParamVOModel;

import java.util.*;

/**
 * readCardParam请求类
 * 储值卡参数读取
 */
public class CardParamReadRequest implements ApiCloudRequest<Void, CustomerCardParamVOModel> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.param.read";
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
    public TypeReference<ApiCloudResponse<CustomerCardParamVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomerCardParamVOModel>>() {};
    }

}

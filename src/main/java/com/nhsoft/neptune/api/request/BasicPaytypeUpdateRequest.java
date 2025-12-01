package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayTypeSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.PayTypeV2DTOModel;

import java.util.*;

/**
 * paytypeUpdate请求类
 * 支付方式修改
 */
public class BasicPaytypeUpdateRequest implements ApiCloudRequest<PayTypeSaveV2DTOModel, PayTypeV2DTOModel> {

    private PayTypeSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.paytype.update";
    }

    @Override
    public PayTypeSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayTypeSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PayTypeV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PayTypeV2DTOModel>>() {};
    }

}

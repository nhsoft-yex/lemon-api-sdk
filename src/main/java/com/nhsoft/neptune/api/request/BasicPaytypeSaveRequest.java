package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayTypeSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.PayTypeV2DTOModel;

import java.util.*;

/**
 * paytypeSave请求类
 * 支付方式新增
 */
public class BasicPaytypeSaveRequest implements ApiCloudRequest<PayTypeSaveV2DTOModel, PayTypeV2DTOModel> {

    private PayTypeSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.paytype.save";
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

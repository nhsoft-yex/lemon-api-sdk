package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FundOrderCheckDTOModel;

import com.nhsoft.neptune.api.domain.PaymentOrderVOModel;

import java.util.*;

/**
 * saveandauditPaymentOrder_1请求类
 * 付款单申诉
 */
public class FundPaymentOrderCheckRequest implements ApiCloudRequest<FundOrderCheckDTOModel, PaymentOrderVOModel> {

    private FundOrderCheckDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payment.order.check";
    }

    @Override
    public FundOrderCheckDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(FundOrderCheckDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PaymentOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PaymentOrderVOModel>>() {};
    }

}

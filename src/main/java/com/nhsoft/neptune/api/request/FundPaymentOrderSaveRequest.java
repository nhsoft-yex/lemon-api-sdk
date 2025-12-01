package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PaymentOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.PaymentOrderVOModel;

import java.util.*;

/**
 * savePaymentOrder请求类
 * 付款单新增
 */
public class FundPaymentOrderSaveRequest implements ApiCloudRequest<PaymentOrderSaveDTOModel, PaymentOrderVOModel> {

    private PaymentOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payment.order.save";
    }

    @Override
    public PaymentOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PaymentOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PaymentOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PaymentOrderVOModel>>() {};
    }

}

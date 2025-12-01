package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PaymentOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.PaymentOrderVOModel;

import java.util.*;

/**
 * readPaymentOrder请求类
 * 付款单读取
 */
public class FundPaymentOrderReadRequest implements ApiCloudRequest<PaymentOrderReadDTOModel, PaymentOrderVOModel> {

    private PaymentOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payment.order.read";
    }

    @Override
    public PaymentOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PaymentOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PaymentOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PaymentOrderVOModel>>() {};
    }

}

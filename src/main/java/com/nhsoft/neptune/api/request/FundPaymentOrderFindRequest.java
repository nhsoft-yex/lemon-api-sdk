package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PaymentOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PaymentOrderVOModel;

import com.nhsoft.neptune.api.domain.PaymentOrderVOModel;

import java.util.*;

/**
 * findPaymentOrder请求类
 * 付款单查询
 */
public class FundPaymentOrderFindRequest implements ApiCloudRequest<PaymentOrderFindDTOModel, List<PaymentOrderVOModel>> {

    private PaymentOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payment.order.find";
    }

    @Override
    public PaymentOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PaymentOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PaymentOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PaymentOrderVOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PaymentOrderAuditDTOModel;

import com.nhsoft.neptune.api.domain.PaymentOrderVOModel;

import java.util.*;

/**
 * saveandauditPaymentOrder请求类
 * 付款单新增并审核
 */
public class FundPaymentOrderSaveandauditRequest implements ApiCloudRequest<PaymentOrderAuditDTOModel, PaymentOrderVOModel> {

    private PaymentOrderAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payment.order.saveandaudit";
    }

    @Override
    public PaymentOrderAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PaymentOrderAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PaymentOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PaymentOrderVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPaymentReadRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPaymentResponseDTOModel;

import java.util.*;

/**
 * readSupplierPaymentSettlement请求类
 * 供应商付款单读取
 */
public class SettlementSupplierpaymentReadRequest implements ApiCloudRequest<SupplierPaymentReadRequestDTOModel, SupplierPaymentResponseDTOModel> {

    private SupplierPaymentReadRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplierpayment.read";
    }

    @Override
    public SupplierPaymentReadRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPaymentReadRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPaymentResponseDTOModel>>() {};
    }

}

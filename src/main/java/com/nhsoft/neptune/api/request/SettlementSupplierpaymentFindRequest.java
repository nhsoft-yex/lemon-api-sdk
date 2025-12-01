package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPaymentFindRequestDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierPaymentResponseDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPaymentResponseDTOModel;

import java.util.*;

/**
 * findSupplierPaymentSettlement请求类
 * 供应商付款单查询
 */
public class SettlementSupplierpaymentFindRequest implements ApiCloudRequest<SupplierPaymentFindRequestDTOModel, List<SupplierPaymentResponseDTOModel>> {

    private SupplierPaymentFindRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplierpayment.find";
    }

    @Override
    public SupplierPaymentFindRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPaymentFindRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierPaymentResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierPaymentResponseDTOModel>>>() {};
    }

}

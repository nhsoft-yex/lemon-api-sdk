package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementAuditRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import java.util.*;

/**
 * auditSupplierSettlement请求类
 * 供应商结算单审核
 */
public class SettlementSupplierAuditRequest implements ApiCloudRequest<SupplierSettlementAuditRequestDTOModel, SupplierSettlementResponseDTOModel> {

    private SupplierSettlementAuditRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.audit";
    }

    @Override
    public SupplierSettlementAuditRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSettlementAuditRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>>() {};
    }

}

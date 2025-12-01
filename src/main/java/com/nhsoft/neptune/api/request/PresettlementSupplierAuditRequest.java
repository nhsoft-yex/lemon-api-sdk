package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementAuditRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import java.util.*;

/**
 * auditPreSupplierSettlement请求类
 * 供应商预付单审核
 */
public class PresettlementSupplierAuditRequest implements ApiCloudRequest<SupplierPreSettlementAuditRequestDTOModel, SupplierPreSettlementResponseDTOModel> {

    private SupplierPreSettlementAuditRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.supplier.audit";
    }

    @Override
    public SupplierPreSettlementAuditRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPreSettlementAuditRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>>() {};
    }

}

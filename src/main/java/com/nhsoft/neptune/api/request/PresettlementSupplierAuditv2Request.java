package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementAuditRequestV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import java.util.*;

/**
 * auditPreSupplierSettlementV2请求类
 * 供应商预付单审核
 */
public class PresettlementSupplierAuditv2Request implements ApiCloudRequest<SupplierPreSettlementAuditRequestV2DTOModel, SupplierPreSettlementResponseDTOModel> {

    private SupplierPreSettlementAuditRequestV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.supplier.audit/v2";
    }

    @Override
    public SupplierPreSettlementAuditRequestV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPreSettlementAuditRequestV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerSettlementAuditRequestDTOModel;

import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import java.util.*;

/**
 * auditInnerSettlement请求类
 * 门店结算单审核
 */
public class SettlementBranchAuditRequest implements ApiCloudRequest<InnerSettlementAuditRequestDTOModel, InnerSettlementResponseDTOModel> {

    private InnerSettlementAuditRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branch.audit";
    }

    @Override
    public InnerSettlementAuditRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerSettlementAuditRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>>() {};
    }

}

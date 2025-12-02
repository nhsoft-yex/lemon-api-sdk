package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientPreSettlementAuditDTOModel;

import com.nhsoft.neptune.api.domain.ClientPreSettlementVOModel;

import java.util.*;

/**
 * audit_5请求类
 * 客户预收单审核
 */
public class PresettlementClientAuditRequest implements ApiCloudRequest<ClientPreSettlementAuditDTOModel, ClientPreSettlementVOModel> {

    private ClientPreSettlementAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.client.audit";
    }

    @Override
    public ClientPreSettlementAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientPreSettlementAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientSettlementAuditDTOModel;

import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import java.util.*;

/**
 * audit_4请求类
 * 客户结算单审核
 */
public class SettlementClientAuditRequest implements ApiCloudRequest<ClientSettlementAuditDTOModel, ClientSettlementVOModel> {

    private ClientSettlementAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.client.audit";
    }

    @Override
    public ClientSettlementAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientSettlementAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientSettlementVOModel>>() {};
    }

}

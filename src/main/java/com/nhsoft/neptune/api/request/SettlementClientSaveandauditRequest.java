package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientSettlementSaveDTOModel;

import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import java.util.*;

/**
 * saveAndAudit_2请求类
 * 客户结算单新增并审核
 */
public class SettlementClientSaveandauditRequest implements ApiCloudRequest<ClientSettlementSaveDTOModel, ClientSettlementVOModel> {

    private ClientSettlementSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.client.saveandaudit";
    }

    @Override
    public ClientSettlementSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientSettlementSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientSettlementVOModel>>() {};
    }

}

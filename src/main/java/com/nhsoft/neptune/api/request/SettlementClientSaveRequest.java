package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientSettlementSaveDTOModel;

import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import java.util.*;

/**
 * save_8请求类
 * 客户结算单新增
 */
public class SettlementClientSaveRequest implements ApiCloudRequest<ClientSettlementSaveDTOModel, ClientSettlementVOModel> {

    private ClientSettlementSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.client.save";
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

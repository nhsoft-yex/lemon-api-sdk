package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientPreSettlementSaveDTOModel;

import com.nhsoft.neptune.api.domain.ClientPreSettlementVOModel;

import java.util.*;

/**
 * save_9请求类
 * 客户预收单新增
 */
public class PresettlementClientSaveRequest implements ApiCloudRequest<ClientPreSettlementSaveDTOModel, ClientPreSettlementVOModel> {

    private ClientPreSettlementSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.client.save";
    }

    @Override
    public ClientPreSettlementSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientPreSettlementSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>>() {};
    }

}

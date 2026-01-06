package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientPreSettlementUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ClientPreSettlementVOModel;

import java.util.*;

/**
 * update_12请求类
 * 客户预收单修改
 */
public class PresettlementClientUpdateRequest implements ApiCloudRequest<ClientPreSettlementUpdateDTOModel, ClientPreSettlementVOModel> {

    private ClientPreSettlementUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.client.update";
    }

    @Override
    public ClientPreSettlementUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientPreSettlementUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>>() {};
    }

}

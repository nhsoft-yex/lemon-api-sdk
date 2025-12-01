package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientSettlementUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import java.util.*;

/**
 * update_7请求类
 * 客户结算单修改
 */
public class SettlementClientUpdateRequest implements ApiCloudRequest<ClientSettlementUpdateDTOModel, ClientSettlementVOModel> {

    private ClientSettlementUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.client.update";
    }

    @Override
    public ClientSettlementUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientSettlementUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientSettlementVOModel>>() {};
    }

}

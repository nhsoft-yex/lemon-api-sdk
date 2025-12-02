package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientPreSettlementReadDTOModel;

import com.nhsoft.neptune.api.domain.ClientPreSettlementVOModel;

import java.util.*;

/**
 * read_21请求类
 * 客户预收单读取
 */
public class PresettlementClientReadRequest implements ApiCloudRequest<ClientPreSettlementReadDTOModel, ClientPreSettlementVOModel> {

    private ClientPreSettlementReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.client.read";
    }

    @Override
    public ClientPreSettlementReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientPreSettlementReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientPreSettlementVOModel>>() {};
    }

}

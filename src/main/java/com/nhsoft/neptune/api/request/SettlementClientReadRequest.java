package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientSettlementReadDTOModel;

import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import java.util.*;

/**
 * read_22请求类
 * 客户结算单查询
 */
public class SettlementClientReadRequest implements ApiCloudRequest<ClientSettlementReadDTOModel, ClientSettlementVOModel> {

    private ClientSettlementReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.client.read";
    }

    @Override
    public ClientSettlementReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientSettlementReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientSettlementVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientSettlementVOModel>>() {};
    }

}

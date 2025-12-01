package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientSettlementFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import java.util.*;

/**
 * find_25请求类
 * 客户结算单查询
 */
public class SettlementClientFindRequest implements ApiCloudRequest<ClientSettlementFindDTOModel, List<ClientSettlementVOModel>> {

    private ClientSettlementFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.client.find";
    }

    @Override
    public ClientSettlementFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientSettlementFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientSettlementVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientSettlementVOModel>>>() {};
    }

}

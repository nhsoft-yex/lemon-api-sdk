package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientSettlementFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import com.nhsoft.neptune.api.domain.ClientSettlementVOModel;

import java.util.*;

/**
 * find_31请求类
 * 客户结算单查询
 */
public class SettlementClientFindv2Request implements ApiCloudRequest<ClientSettlementFindV2DTOModel, List<ClientSettlementVOModel>> {

    private ClientSettlementFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.client.find/v2";
    }

    @Override
    public ClientSettlementFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientSettlementFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientSettlementVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientSettlementVOModel>>>() {};
    }

}

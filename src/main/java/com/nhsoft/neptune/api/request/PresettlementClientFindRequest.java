package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientPreSettlementFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientPreSettlementVOModel;

import com.nhsoft.neptune.api.domain.ClientPreSettlementVOModel;

import java.util.*;

/**
 * find_28请求类
 * 客户预收单查询
 */
public class PresettlementClientFindRequest implements ApiCloudRequest<ClientPreSettlementFindDTOModel, List<ClientPreSettlementVOModel>> {

    private ClientPreSettlementFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.client.find";
    }

    @Override
    public ClientPreSettlementFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientPreSettlementFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientPreSettlementVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientPreSettlementVOModel>>>() {};
    }

}

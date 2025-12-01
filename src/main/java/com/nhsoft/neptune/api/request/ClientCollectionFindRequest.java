package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientCollectionFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientCollectionVOModel;

import com.nhsoft.neptune.api.domain.ClientCollectionVOModel;

import java.util.*;

/**
 * find_33请求类
 * 客户收款单查询
 */
public class ClientCollectionFindRequest implements ApiCloudRequest<ClientCollectionFindDTOModel, List<ClientCollectionVOModel>> {

    private ClientCollectionFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.client.collection.find";
    }

    @Override
    public ClientCollectionFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientCollectionFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientCollectionVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientCollectionVOModel>>>() {};
    }

}

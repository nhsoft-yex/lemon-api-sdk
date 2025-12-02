package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientCollectionReadDTOModel;

import com.nhsoft.neptune.api.domain.ClientCollectionVOModel;

import java.util.*;

/**
 * read_27请求类
 * 客户收款单读取
 */
public class ClientCollectionReadRequest implements ApiCloudRequest<ClientCollectionReadDTOModel, ClientCollectionVOModel> {

    private ClientCollectionReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.client.collection.read";
    }

    @Override
    public ClientCollectionReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientCollectionReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientCollectionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientCollectionVOModel>>() {};
    }

}

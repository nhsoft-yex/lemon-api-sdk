package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientBatchFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosClientExtendVOModel;

import com.nhsoft.neptune.api.domain.PosClientExtendVOModel;

import java.util.*;

/**
 * clientCategoryUpdate_1请求类
 * 客户拓展属性查询
 */
public class BasicClientExtendFindRequest implements ApiCloudRequest<ClientBatchFindDTOModel, List<PosClientExtendVOModel>> {

    private ClientBatchFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.extend.find";
    }

    @Override
    public ClientBatchFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientBatchFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosClientExtendVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosClientExtendVOModel>>>() {};
    }

}

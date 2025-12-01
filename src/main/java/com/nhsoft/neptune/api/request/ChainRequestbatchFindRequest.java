package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestBatchFindDTOModel;

import com.nhsoft.neptune.api.domain.RequestBatchVOModel;

import java.util.*;

/**
 * requestBatchFind请求类
 * 要货周期查询
 */
public class ChainRequestbatchFindRequest implements ApiCloudRequest<RequestBatchFindDTOModel, RequestBatchVOModel> {

    private RequestBatchFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.requestbatch.find";
    }

    @Override
    public RequestBatchFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestBatchFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestBatchVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestBatchVOModel>>() {};
    }

}

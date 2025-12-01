package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestBatchReadDTOModel;

import com.nhsoft.neptune.api.domain.RequestBatchVOModel;

import java.util.*;

/**
 * readRequetBatch请求类
 * 要货周期读取
 */
public class ChainRequestbatchReadRequest implements ApiCloudRequest<RequestBatchReadDTOModel, RequestBatchVOModel> {

    private RequestBatchReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.requestbatch.read";
    }

    @Override
    public RequestBatchReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestBatchReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestBatchVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestBatchVOModel>>() {};
    }

}

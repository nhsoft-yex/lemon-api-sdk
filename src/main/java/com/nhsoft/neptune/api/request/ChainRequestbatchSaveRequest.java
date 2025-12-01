package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestBatchSaveDTOModel;

import com.nhsoft.neptune.api.domain.RequestBatchVOModel;

import java.util.*;

/**
 * saveRequestBatch请求类
 * 要货周期新增
 */
public class ChainRequestbatchSaveRequest implements ApiCloudRequest<RequestBatchSaveDTOModel, RequestBatchVOModel> {

    private RequestBatchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.requestbatch.save";
    }

    @Override
    public RequestBatchSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestBatchSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestBatchVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestBatchVOModel>>() {};
    }

}

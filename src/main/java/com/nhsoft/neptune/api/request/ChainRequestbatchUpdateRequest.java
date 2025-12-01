package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestBatchUpdateDTOModel;

import com.nhsoft.neptune.api.domain.RequestBatchVOModel;

import java.util.*;

/**
 * updateRequestBatch请求类
 * 要货周期修改
 */
public class ChainRequestbatchUpdateRequest implements ApiCloudRequest<RequestBatchUpdateDTOModel, RequestBatchVOModel> {

    private RequestBatchUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.requestbatch.update";
    }

    @Override
    public RequestBatchUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestBatchUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestBatchVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestBatchVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestOrderBatchDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * mergeRequest请求类
 * 要货单多单合并
 */
public class ChainRequestMergeRequest implements ApiCloudRequest<RequestOrderBatchDTOModel, List<RequestOrderVOModel>> {

    private RequestOrderBatchDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.merge";
    }

    @Override
    public RequestOrderBatchDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestOrderBatchDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<RequestOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<RequestOrderVOModel>>>() {};
    }

}

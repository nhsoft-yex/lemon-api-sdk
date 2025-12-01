package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestReadDTOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * requestRead请求类
 * 要货单读取
 */
public class ChainRequestReadRequest implements ApiCloudRequest<RequestReadDTOModel, RequestOrderVOModel> {

    private RequestReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.read";
    }

    @Override
    public RequestReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestOrderVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestStopV2DTOModel;

import java.util.*;

/**
 * stopRequest请求类
 * 要货单中止
 */
public class ChainRequestStopRequest implements ApiCloudRequest<RequestStopV2DTOModel, Void> {

    private RequestStopV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.stop";
    }

    @Override
    public RequestStopV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestStopV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

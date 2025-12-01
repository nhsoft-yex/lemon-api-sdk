package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * requestUpdate请求类
 * 要货单修改
 */
public class ChainRequestUpdateRequest implements ApiCloudRequest<RequestUpdateV2DTOModel, RequestOrderVOModel> {

    private RequestUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.update";
    }

    @Override
    public RequestUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestOrderVOModel>>() {};
    }

}

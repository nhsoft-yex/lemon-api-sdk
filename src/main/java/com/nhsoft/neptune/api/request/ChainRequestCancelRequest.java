package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestCancelV2DTOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * requestCancel_1请求类
 * 要货单作废
 */
public class ChainRequestCancelRequest implements ApiCloudRequest<RequestCancelV2DTOModel, RequestOrderVOModel> {

    private RequestCancelV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.cancel";
    }

    @Override
    public RequestCancelV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestCancelV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestOrderVOModel>>() {};
    }

}

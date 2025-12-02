package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodReadDTOModel;

import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodFullyVOModel;

import java.util.*;

/**
 * find_28请求类
 * 批发订货模板读取
 */
public class RequestTimeFoodReadRequest implements ApiCloudRequest<ClientRequestTimeFoodReadDTOModel, ClientRequestTimeFoodFullyVOModel> {

    private ClientRequestTimeFoodReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.request.time.food.read";
    }

    @Override
    public ClientRequestTimeFoodReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientRequestTimeFoodReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientRequestTimeFoodFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientRequestTimeFoodFullyVOModel>>() {};
    }

}

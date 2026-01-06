package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodFullyVOModel;

import java.util.*;

/**
 * update_10请求类
 * 批发订货模板修改
 */
public class RequestTimeFoodUpdateRequest implements ApiCloudRequest<ClientRequestTimeFoodUpdateDTOModel, ClientRequestTimeFoodFullyVOModel> {

    private ClientRequestTimeFoodUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.request.time.food.update";
    }

    @Override
    public ClientRequestTimeFoodUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientRequestTimeFoodUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientRequestTimeFoodFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientRequestTimeFoodFullyVOModel>>() {};
    }

}

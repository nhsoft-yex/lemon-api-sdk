package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodSaveDTOModel;

import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodFullyVOModel;

import java.util.*;

/**
 * save_9请求类
 * 批发订货模板新增
 */
public class RequestTimeFoodSaveRequest implements ApiCloudRequest<ClientRequestTimeFoodSaveDTOModel, ClientRequestTimeFoodFullyVOModel> {

    private ClientRequestTimeFoodSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.request.time.food.save";
    }

    @Override
    public ClientRequestTimeFoodSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientRequestTimeFoodSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ClientRequestTimeFoodFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ClientRequestTimeFoodFullyVOModel>>() {};
    }

}

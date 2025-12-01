package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodVOModel;

import com.nhsoft.neptune.api.domain.ClientRequestTimeFoodVOModel;

import java.util.*;

/**
 * find_16请求类
 * 批发订货模板查询
 */
public class RequestTimeFoodFindRequest implements ApiCloudRequest<ClientRequestTimeFoodFindDTOModel, List<ClientRequestTimeFoodVOModel>> {

    private ClientRequestTimeFoodFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.request.time.food.find";
    }

    @Override
    public ClientRequestTimeFoodFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ClientRequestTimeFoodFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ClientRequestTimeFoodVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ClientRequestTimeFoodVOModel>>>() {};
    }

}

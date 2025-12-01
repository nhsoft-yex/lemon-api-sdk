package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * requestFind请求类
 * 查询要货单
 */
public class ChainRequestFindRequest implements ApiCloudRequest<RequestFindV2DTOModel, List<RequestOrderVOModel>> {

    private RequestFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.find";
    }

    @Override
    public RequestFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<RequestOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<RequestOrderVOModel>>>() {};
    }

}

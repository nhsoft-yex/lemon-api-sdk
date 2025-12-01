package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * requestFindV2请求类
 * 查询要货单
 */
public class ChainRequestFindv2Request implements ApiCloudRequest<RequestFindV3DTOModel, List<RequestOrderVOModel>> {

    private RequestFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.find/v2";
    }

    @Override
    public RequestFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<RequestOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<RequestOrderVOModel>>>() {};
    }

}

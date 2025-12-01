package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import java.util.*;

/**
 * findOutOrder请求类
 * 查询调出单
 */
public class ChainOutorderFindRequest implements ApiCloudRequest<OutOrderFindV2DTOModel, List<OutOrderV2DTOModel>> {

    private OutOrderFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.find";
    }

    @Override
    public OutOrderFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutOrderFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<OutOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OutOrderV2DTOModel>>>() {};
    }

}

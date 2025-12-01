package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import java.util.*;

/**
 * findOutOrderV2请求类
 * 查询调出单
 */
public class ChainOutorderFindv2Request implements ApiCloudRequest<OutOrderFindV3DTOModel, List<OutOrderV2DTOModel>> {

    private OutOrderFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.find/v2";
    }

    @Override
    public OutOrderFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutOrderFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<OutOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OutOrderV2DTOModel>>>() {};
    }

}

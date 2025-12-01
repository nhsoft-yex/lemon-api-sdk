package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InOrderFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import java.util.*;

/**
 * findInOrderV2请求类
 * 查询调入单
 */
public class ChainInorderFindv2Request implements ApiCloudRequest<InOrderFindV3DTOModel, List<InOrderV2DTOModel>> {

    private InOrderFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inorder.find/v2";
    }

    @Override
    public InOrderFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InOrderFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InOrderV2DTOModel>>>() {};
    }

}

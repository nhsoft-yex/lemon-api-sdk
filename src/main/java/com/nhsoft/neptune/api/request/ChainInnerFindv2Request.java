package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * findChainInnerV2请求类
 * 内部申请单查询
 */
public class ChainInnerFindv2Request implements ApiCloudRequest<InnerFindV3DTOModel, List<InnerOrderFindV2DTOModel>> {

    private InnerFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.find/v2";
    }

    @Override
    public InnerFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InnerOrderFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InnerOrderFindV2DTOModel>>>() {};
    }

}

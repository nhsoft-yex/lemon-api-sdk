package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * findChainInner请求类
 * 内部申请单查询
 */
public class ChainInnerFindRequest implements ApiCloudRequest<InnerFindV2DTOModel, List<InnerOrderFindV2DTOModel>> {

    private InnerFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.find";
    }

    @Override
    public InnerFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InnerOrderFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InnerOrderFindV2DTOModel>>>() {};
    }

}

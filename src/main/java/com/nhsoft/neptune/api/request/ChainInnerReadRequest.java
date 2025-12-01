package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerReadV2DTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * innerRead请求类
 * 内部申请单读取
 */
public class ChainInnerReadRequest implements ApiCloudRequest<InnerReadV2DTOModel, InnerOrderFindV2DTOModel> {

    private InnerReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.read";
    }

    @Override
    public InnerReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>>() {};
    }

}

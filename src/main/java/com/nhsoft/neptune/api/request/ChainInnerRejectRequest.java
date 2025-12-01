package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerRejectV2DTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * innerReject请求类
 * 内部申请单拒绝
 */
public class ChainInnerRejectRequest implements ApiCloudRequest<InnerRejectV2DTOModel, InnerOrderFindV2DTOModel> {

    private InnerRejectV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.reject";
    }

    @Override
    public InnerRejectV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerRejectV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>>() {};
    }

}

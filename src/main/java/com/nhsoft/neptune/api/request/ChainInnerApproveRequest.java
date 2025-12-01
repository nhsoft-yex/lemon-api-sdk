package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerApproveV2DTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * innerApprove请求类
 * 内部申请单批复
 */
public class ChainInnerApproveRequest implements ApiCloudRequest<InnerApproveV2DTOModel, InnerOrderFindV2DTOModel> {

    private InnerApproveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.approve";
    }

    @Override
    public InnerApproveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerApproveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>>() {};
    }

}

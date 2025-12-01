package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * innerAudit请求类
 * 内部申请单审核
 */
public class ChainInnerAuditRequest implements ApiCloudRequest<InnerUpdateV2DTOModel, InnerOrderFindV2DTOModel> {

    private InnerUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.audit";
    }

    @Override
    public InnerUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>>() {};
    }

}

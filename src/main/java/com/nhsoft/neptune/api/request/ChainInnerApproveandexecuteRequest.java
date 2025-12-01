package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerApproveAndExecuteDTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * approvalAndExecute请求类
 * 内部申请单批复并执行
 */
public class ChainInnerApproveandexecuteRequest implements ApiCloudRequest<InnerApproveAndExecuteDTOModel, InnerOrderFindV2DTOModel> {

    private InnerApproveAndExecuteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.approveandexecute";
    }

    @Override
    public InnerApproveAndExecuteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerApproveAndExecuteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>>() {};
    }

}

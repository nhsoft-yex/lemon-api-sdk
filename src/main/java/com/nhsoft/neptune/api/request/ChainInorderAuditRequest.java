package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InOrderAuditV2DTOModel;

import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import java.util.*;

/**
 * InOrderAudit请求类
 * 调入单审核
 */
public class ChainInorderAuditRequest implements ApiCloudRequest<InOrderAuditV2DTOModel, InOrderV2DTOModel> {

    private InOrderAuditV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inorder.audit";
    }

    @Override
    public InOrderAuditV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InOrderAuditV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InOrderV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import java.util.*;

/**
 * auditOutOrder请求类
 * 调出单审核
 */
public class ChainOutorderAuditRequest implements ApiCloudRequest<OutOrderUpdateV2DTOModel, OutOrderV2DTOModel> {

    private OutOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.audit";
    }

    @Override
    public OutOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OutOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OutOrderV2DTOModel>>() {};
    }

}

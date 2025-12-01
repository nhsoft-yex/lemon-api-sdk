package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestAuditV2DTOModel;

import com.nhsoft.neptune.api.domain.RequestOrderVOModel;

import java.util.*;

/**
 * requestAudit请求类
 * 要货单审核
 */
public class ChainRequestAuditRequest implements ApiCloudRequest<RequestAuditV2DTOModel, RequestOrderVOModel> {

    private RequestAuditV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.audit";
    }

    @Override
    public RequestAuditV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestAuditV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestOrderVOModel>>() {};
    }

}

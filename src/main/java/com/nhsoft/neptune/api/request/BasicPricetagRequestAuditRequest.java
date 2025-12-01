package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PricetagRequestAuditDTOModel;

import com.nhsoft.neptune.api.domain.PricetagRequestVOModel;

import java.util.*;

/**
 * audit_9请求类
 * 价签申请单审核
 */
public class BasicPricetagRequestAuditRequest implements ApiCloudRequest<PricetagRequestAuditDTOModel, PricetagRequestVOModel> {

    private PricetagRequestAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.pricetag.request.audit";
    }

    @Override
    public PricetagRequestAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PricetagRequestAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PricetagRequestVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PricetagRequestVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPromotionUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPromotionVOModel;

import java.util.*;

/**
 * audit_7请求类
 * 促销特价审核
 */
public class PolicyPromotionAuditRequest implements ApiCloudRequest<PolicyPromotionUpdateDTOModel, PolicyPromotionVOModel> {

    private PolicyPromotionUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.promotion.audit";
    }

    @Override
    public PolicyPromotionUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPromotionUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPromotionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPromotionVOModel>>() {};
    }

}

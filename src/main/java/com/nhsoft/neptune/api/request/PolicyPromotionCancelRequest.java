package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyCancelDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPromotionVOModel;

import java.util.*;

/**
 * cancel_4请求类
 * 促销特价作废
 */
public class PolicyPromotionCancelRequest implements ApiCloudRequest<PolicyCancelDTOModel, PolicyPromotionVOModel> {

    private PolicyCancelDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.promotion.cancel";
    }

    @Override
    public PolicyCancelDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyCancelDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPromotionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPromotionVOModel>>() {};
    }

}

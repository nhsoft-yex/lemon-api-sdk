package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyDiscountUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PolicyDiscountVOModel;

import java.util.*;

/**
 * policyDiscountUpdate请求类
 * 超额折扣修改
 */
public class PolicyDiscountUpdateRequest implements ApiCloudRequest<PolicyDiscountUpdateDTOModel, PolicyDiscountVOModel> {

    private PolicyDiscountUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.discount.update";
    }

    @Override
    public PolicyDiscountUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyDiscountUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyDiscountVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyDiscountVOModel>>() {};
    }

}

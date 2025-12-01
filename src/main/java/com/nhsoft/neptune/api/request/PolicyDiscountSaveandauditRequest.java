package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyDiscountSaveDTOModel;

import com.nhsoft.neptune.api.domain.PolicyDiscountVOModel;

import java.util.*;

/**
 * policyDiscountSaveAndAudit请求类
 * 超额折扣保存并审核
 */
public class PolicyDiscountSaveandauditRequest implements ApiCloudRequest<PolicyDiscountSaveDTOModel, PolicyDiscountVOModel> {

    private PolicyDiscountSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.discount.saveandaudit";
    }

    @Override
    public PolicyDiscountSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyDiscountSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyDiscountVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyDiscountVOModel>>() {};
    }

}

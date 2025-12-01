package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyApplyBranchUpdateDTOModel;

import java.util.*;

/**
 * policyDiscountBranchUpdate请求类
 * 超额折扣应用门店修改
 */
public class PolicyDiscountApplyBranchUpdateRequest implements ApiCloudRequest<PolicyApplyBranchUpdateDTOModel, Void> {

    private PolicyApplyBranchUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.discount.apply.branch.update";
    }

    @Override
    public PolicyApplyBranchUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyApplyBranchUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

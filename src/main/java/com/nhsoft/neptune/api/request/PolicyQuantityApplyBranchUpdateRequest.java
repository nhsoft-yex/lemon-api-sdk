package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyApplyBranchUpdateDTOModel;

import java.util.*;

/**
 * policyQuantityBranchUpdate请求类
 * 超量特价应用门店修改
 */
public class PolicyQuantityApplyBranchUpdateRequest implements ApiCloudRequest<PolicyApplyBranchUpdateDTOModel, Void> {

    private PolicyApplyBranchUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.quantity.apply.branch.update";
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

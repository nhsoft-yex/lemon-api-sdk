package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyCancelDTOModel;

import com.nhsoft.neptune.api.domain.PolicyQuantityVOModel;

import java.util.*;

/**
 * cancel_3请求类
 * 超量特价作废
 */
public class PolicyQuantityCancelRequest implements ApiCloudRequest<PolicyCancelDTOModel, PolicyQuantityVOModel> {

    private PolicyCancelDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.quantity.cancel";
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
    public TypeReference<ApiCloudResponse<PolicyQuantityVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyQuantityVOModel>>() {};
    }

}

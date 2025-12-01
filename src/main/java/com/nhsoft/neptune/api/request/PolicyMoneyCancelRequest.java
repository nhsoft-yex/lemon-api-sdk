package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyCancelDTOModel;

import com.nhsoft.neptune.api.domain.PolicyMoneyVOModel;

import java.util.*;

/**
 * cancel_6请求类
 * 超额奖励作废
 */
public class PolicyMoneyCancelRequest implements ApiCloudRequest<PolicyCancelDTOModel, PolicyMoneyVOModel> {

    private PolicyCancelDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.money.cancel";
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
    public TypeReference<ApiCloudResponse<PolicyMoneyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyMoneyVOModel>>() {};
    }

}

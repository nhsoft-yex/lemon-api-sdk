package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyMoneySaveDTOModel;

import com.nhsoft.neptune.api.domain.PolicyMoneyVOModel;

import java.util.*;

/**
 * saveAndAudit_9请求类
 * 超额奖励保存并审核
 */
public class PolicyMoneySaveandauditRequest implements ApiCloudRequest<PolicyMoneySaveDTOModel, PolicyMoneyVOModel> {

    private PolicyMoneySaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.money.saveandaudit";
    }

    @Override
    public PolicyMoneySaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyMoneySaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyMoneyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyMoneyVOModel>>() {};
    }

}

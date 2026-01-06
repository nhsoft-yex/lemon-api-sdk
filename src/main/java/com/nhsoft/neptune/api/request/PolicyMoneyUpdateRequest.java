package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyMoneyUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PolicyMoneyVOModel;

import java.util.*;

/**
 * update_16请求类
 * 超额奖励修改
 */
public class PolicyMoneyUpdateRequest implements ApiCloudRequest<PolicyMoneyUpdateDTOModel, PolicyMoneyVOModel> {

    private PolicyMoneyUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.money.update";
    }

    @Override
    public PolicyMoneyUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyMoneyUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyMoneyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyMoneyVOModel>>() {};
    }

}

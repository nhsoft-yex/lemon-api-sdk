package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyMoneyDateToUpdateDTOModel;

import java.util.*;

/**
 * policyMoneyDateToUpdate请求类
 * 超额奖励修改结束时间
 */
public class PolicyMoneyDateToUpdateRequest implements ApiCloudRequest<PolicyMoneyDateToUpdateDTOModel, Void> {

    private PolicyMoneyDateToUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.money.date.to.update";
    }

    @Override
    public PolicyMoneyDateToUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyMoneyDateToUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

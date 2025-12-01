package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyQuantityDateToUpdateDTOModel;

import java.util.*;

/**
 * policyQuantityDateToUpdate请求类
 * 超量特价改结束时间
 */
public class PolicyQuantityDateToUpdateRequest implements ApiCloudRequest<PolicyQuantityDateToUpdateDTOModel, Void> {

    private PolicyQuantityDateToUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.quantity.date.to.update";
    }

    @Override
    public PolicyQuantityDateToUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyQuantityDateToUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyQuantityUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PolicyQuantityVOModel;

import java.util.*;

/**
 * update_11请求类
 * 超量特价修改
 */
public class PolicyQuantityUpdateRequest implements ApiCloudRequest<PolicyQuantityUpdateDTOModel, PolicyQuantityVOModel> {

    private PolicyQuantityUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.quantity.update";
    }

    @Override
    public PolicyQuantityUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyQuantityUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyQuantityVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyQuantityVOModel>>() {};
    }

}

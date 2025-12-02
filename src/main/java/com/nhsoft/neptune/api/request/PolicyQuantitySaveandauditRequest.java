package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyQuantitySaveDTOModel;

import com.nhsoft.neptune.api.domain.PolicyQuantityVOModel;

import java.util.*;

/**
 * saveAndAudit_4请求类
 * 超量特价保存并审核
 */
public class PolicyQuantitySaveandauditRequest implements ApiCloudRequest<PolicyQuantitySaveDTOModel, PolicyQuantityVOModel> {

    private PolicyQuantitySaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.quantity.saveandaudit";
    }

    @Override
    public PolicyQuantitySaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyQuantitySaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyQuantityVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyQuantityVOModel>>() {};
    }

}

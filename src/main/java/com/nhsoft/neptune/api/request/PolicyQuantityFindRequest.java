package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyQuantityVOModel;

import com.nhsoft.neptune.api.domain.PolicyQuantityVOModel;

import java.util.*;

/**
 * policyQuantityFind请求类
 * 超量特价查询
 */
public class PolicyQuantityFindRequest implements ApiCloudRequest<PolicyFindDTOModel, List<PolicyQuantityVOModel>> {

    private PolicyFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.quantity.find";
    }

    @Override
    public PolicyFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PolicyQuantityVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyQuantityVOModel>>>() {};
    }

}

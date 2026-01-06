package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyMoneyVOModel;

import com.nhsoft.neptune.api.domain.PolicyMoneyVOModel;

import java.util.*;

/**
 * find_37请求类
 * 超额奖励查询
 */
public class PolicyMoneyFindRequest implements ApiCloudRequest<PolicyFindDTOModel, List<PolicyMoneyVOModel>> {

    private PolicyFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.money.find";
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
    public TypeReference<ApiCloudResponse<List<PolicyMoneyVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyMoneyVOModel>>>() {};
    }

}

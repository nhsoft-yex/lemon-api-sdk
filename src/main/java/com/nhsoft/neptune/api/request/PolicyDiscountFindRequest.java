package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyDiscountVOModel;

import com.nhsoft.neptune.api.domain.PolicyDiscountVOModel;

import java.util.*;

/**
 * policyDiscountFind请求类
 * 超额折扣查询
 */
public class PolicyDiscountFindRequest implements ApiCloudRequest<PolicyFindDTOModel, List<PolicyDiscountVOModel>> {

    private PolicyFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.discount.find";
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
    public TypeReference<ApiCloudResponse<List<PolicyDiscountVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyDiscountVOModel>>>() {};
    }

}

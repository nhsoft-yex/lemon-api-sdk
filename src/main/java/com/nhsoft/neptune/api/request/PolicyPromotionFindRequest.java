package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyPromotionVOModel;

import com.nhsoft.neptune.api.domain.PolicyPromotionVOModel;

import java.util.*;

/**
 * find_30请求类
 * 促销特价查询
 */
public class PolicyPromotionFindRequest implements ApiCloudRequest<PolicyFindDTOModel, List<PolicyPromotionVOModel>> {

    private PolicyFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.promotion.find";
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
    public TypeReference<ApiCloudResponse<List<PolicyPromotionVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyPromotionVOModel>>>() {};
    }

}

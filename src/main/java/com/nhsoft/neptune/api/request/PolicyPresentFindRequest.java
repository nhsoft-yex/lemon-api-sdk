package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PolicyPresentVOModel;

import com.nhsoft.neptune.api.domain.PolicyPresentVOModel;

import java.util.*;

/**
 * find_36请求类
 * 赠品促销查询
 */
public class PolicyPresentFindRequest implements ApiCloudRequest<PolicyFindDTOModel, List<PolicyPresentVOModel>> {

    private PolicyFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.present.find";
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
    public TypeReference<ApiCloudResponse<List<PolicyPresentVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PolicyPresentVOModel>>>() {};
    }

}

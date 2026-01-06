package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPresentSaveDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPresentVOModel;

import java.util.*;

/**
 * save_15请求类
 * 赠品促销保存
 */
public class PolicyPresentSaveRequest implements ApiCloudRequest<PolicyPresentSaveDTOModel, PolicyPresentVOModel> {

    private PolicyPresentSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.present.save";
    }

    @Override
    public PolicyPresentSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPresentSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPresentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPresentVOModel>>() {};
    }

}

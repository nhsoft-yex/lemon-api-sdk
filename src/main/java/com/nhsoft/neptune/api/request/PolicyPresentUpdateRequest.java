package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPresentUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPresentVOModel;

import java.util.*;

/**
 * update_13请求类
 * 赠品促销修改
 */
public class PolicyPresentUpdateRequest implements ApiCloudRequest<PolicyPresentUpdateDTOModel, PolicyPresentVOModel> {

    private PolicyPresentUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.present.update";
    }

    @Override
    public PolicyPresentUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPresentUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPresentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPresentVOModel>>() {};
    }

}

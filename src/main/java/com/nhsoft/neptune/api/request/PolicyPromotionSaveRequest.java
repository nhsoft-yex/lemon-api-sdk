package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPromotionSaveDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPromotionVOModel;

import java.util.*;

/**
 * save_14请求类
 * 促销特价保存
 */
public class PolicyPromotionSaveRequest implements ApiCloudRequest<PolicyPromotionSaveDTOModel, PolicyPromotionVOModel> {

    private PolicyPromotionSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.promotion.save";
    }

    @Override
    public PolicyPromotionSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPromotionSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PolicyPromotionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PolicyPromotionVOModel>>() {};
    }

}

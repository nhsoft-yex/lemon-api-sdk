package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPromotionSaveDTOModel;

import com.nhsoft.neptune.api.domain.PolicyPromotionVOModel;

import java.util.*;

/**
 * saveAndAudit_7请求类
 * 促销特价保存并审核
 */
public class PolicyPromotionSaveandauditRequest implements ApiCloudRequest<PolicyPromotionSaveDTOModel, PolicyPromotionVOModel> {

    private PolicyPromotionSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.promotion.saveandaudit";
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

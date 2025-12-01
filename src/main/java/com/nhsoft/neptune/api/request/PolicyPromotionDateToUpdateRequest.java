package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPromotionDateToUpdateDTOModel;

import java.util.*;

/**
 * policyPromotionDateToUpdate请求类
 * 促销特价修改结束时间
 */
public class PolicyPromotionDateToUpdateRequest implements ApiCloudRequest<PolicyPromotionDateToUpdateDTOModel, Void> {

    private PolicyPromotionDateToUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.promotion.date.to.update";
    }

    @Override
    public PolicyPromotionDateToUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPromotionDateToUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

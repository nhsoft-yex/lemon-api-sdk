package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyPresentDateToUpdateDTOModel;

import java.util.*;

/**
 * policyPromotionDateToUpdate_1请求类
 * 赠品促销修改结束时间
 */
public class PolicyPresentDateToUpdateRequest implements ApiCloudRequest<PolicyPresentDateToUpdateDTOModel, Void> {

    private PolicyPresentDateToUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.present.date.to.update";
    }

    @Override
    public PolicyPresentDateToUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyPresentDateToUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PolicyDiscountDateToUpdateDTOModel;

import java.util.*;

/**
 * policyDiscountDateToUpdate请求类
 * 超额折扣修改结束时间
 */
public class PolicyDiscountDateToUpdateRequest implements ApiCloudRequest<PolicyDiscountDateToUpdateDTOModel, Void> {

    private PolicyDiscountDateToUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.policy.discount.date.to.update";
    }

    @Override
    public PolicyDiscountDateToUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PolicyDiscountDateToUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

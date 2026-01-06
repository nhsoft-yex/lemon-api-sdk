package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPolicyDiscountUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WhsPolicyDiscountVOModel;

import java.util.*;

/**
 * audit_1请求类
 * 批发超额折扣审核
 */
public class WhsPolicyDiscountAuditRequest implements ApiCloudRequest<WhsPolicyDiscountUpdateDTOModel, WhsPolicyDiscountVOModel> {

    private WhsPolicyDiscountUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.policy.discount.audit";
    }

    @Override
    public WhsPolicyDiscountUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsPolicyDiscountUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsPolicyDiscountVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsPolicyDiscountVOModel>>() {};
    }

}

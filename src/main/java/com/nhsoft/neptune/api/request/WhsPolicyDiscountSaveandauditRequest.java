package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPolicyDiscountSaveDTOModel;

import com.nhsoft.neptune.api.domain.WhsPolicyDiscountVOModel;

import java.util.*;

/**
 * saveAndAudit请求类
 * 批发超额折扣新增并审核
 */
public class WhsPolicyDiscountSaveandauditRequest implements ApiCloudRequest<WhsPolicyDiscountSaveDTOModel, WhsPolicyDiscountVOModel> {

    private WhsPolicyDiscountSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.policy.discount.saveandaudit";
    }

    @Override
    public WhsPolicyDiscountSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsPolicyDiscountSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsPolicyDiscountVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsPolicyDiscountVOModel>>() {};
    }

}

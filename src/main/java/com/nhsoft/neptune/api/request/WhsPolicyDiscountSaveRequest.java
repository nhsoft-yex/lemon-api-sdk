package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPolicyDiscountSaveDTOModel;

import com.nhsoft.neptune.api.domain.WhsPolicyDiscountVOModel;

import java.util.*;

/**
 * save_4请求类
 * 批发超额折扣新增
 */
public class WhsPolicyDiscountSaveRequest implements ApiCloudRequest<WhsPolicyDiscountSaveDTOModel, WhsPolicyDiscountVOModel> {

    private WhsPolicyDiscountSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.policy.discount.save";
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

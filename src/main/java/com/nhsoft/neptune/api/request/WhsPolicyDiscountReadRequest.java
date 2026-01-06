package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPolicyDiscountVOModel;

import java.util.*;

/**
 * read_19请求类
 * 批发超额折扣读取
 */
public class WhsPolicyDiscountReadRequest implements ApiCloudRequest<String, WhsPolicyDiscountVOModel> {

    private String bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.policy.discount.read";
    }

    @Override
    public String getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(String bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WhsPolicyDiscountVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WhsPolicyDiscountVOModel>>() {};
    }

}

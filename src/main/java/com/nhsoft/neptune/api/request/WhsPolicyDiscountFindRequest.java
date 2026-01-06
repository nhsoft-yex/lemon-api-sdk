package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPolicyDiscountFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WhsPolicyDiscountVOModel;

import com.nhsoft.neptune.api.domain.WhsPolicyDiscountVOModel;

import java.util.*;

/**
 * find_15请求类
 * 批发超额折扣查询
 */
public class WhsPolicyDiscountFindRequest implements ApiCloudRequest<WhsPolicyDiscountFindDTOModel, List<WhsPolicyDiscountVOModel>> {

    private WhsPolicyDiscountFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.policy.discount.find";
    }

    @Override
    public WhsPolicyDiscountFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsPolicyDiscountFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WhsPolicyDiscountVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WhsPolicyDiscountVOModel>>>() {};
    }

}

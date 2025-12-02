package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DiscountCodeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.DiscountCodeSimpleVOModel;

import com.nhsoft.neptune.api.domain.DiscountCodeSimpleVOModel;

import java.util.*;

/**
 * find_21请求类
 * 折扣码查询
 */
public class DiscountCodeFindRequest implements ApiCloudRequest<DiscountCodeFindDTOModel, List<DiscountCodeSimpleVOModel>> {

    private DiscountCodeFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.discount.code.find";
    }

    @Override
    public DiscountCodeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DiscountCodeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<DiscountCodeSimpleVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<DiscountCodeSimpleVOModel>>>() {};
    }

}

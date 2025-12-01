package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DiscountCodeReadDTOModel;

import com.nhsoft.neptune.api.domain.DiscountCodeVOModel;

import java.util.*;

/**
 * read_23请求类
 * 折扣码读取
 */
public class DiscountCodeReadRequest implements ApiCloudRequest<DiscountCodeReadDTOModel, DiscountCodeVOModel> {

    private DiscountCodeReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.discount.code.read";
    }

    @Override
    public DiscountCodeReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DiscountCodeReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<DiscountCodeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<DiscountCodeVOModel>>() {};
    }

}

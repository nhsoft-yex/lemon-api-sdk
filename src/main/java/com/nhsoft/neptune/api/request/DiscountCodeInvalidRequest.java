package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DiscountCodeOperateDTOModel;

import java.util.*;

/**
 * invalid_1请求类
 * 折扣码作废
 */
public class DiscountCodeInvalidRequest implements ApiCloudRequest<DiscountCodeOperateDTOModel, Void> {

    private DiscountCodeOperateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.discount.code.invalid";
    }

    @Override
    public DiscountCodeOperateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DiscountCodeOperateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

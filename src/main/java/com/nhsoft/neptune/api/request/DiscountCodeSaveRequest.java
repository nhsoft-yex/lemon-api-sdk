package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DiscountCodeSaveDTOModel;

import java.util.*;

/**
 * save_15请求类
 * 折扣码新增
 */
public class DiscountCodeSaveRequest implements ApiCloudRequest<DiscountCodeSaveDTOModel, Void> {

    private DiscountCodeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.discount.code.save";
    }

    @Override
    public DiscountCodeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DiscountCodeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

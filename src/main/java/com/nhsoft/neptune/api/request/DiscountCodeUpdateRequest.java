package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DiscountCodeUpdateDTOModel;

import java.util.*;

/**
 * update_17请求类
 * 折扣码修改
 */
public class DiscountCodeUpdateRequest implements ApiCloudRequest<DiscountCodeUpdateDTOModel, Void> {

    private DiscountCodeUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.discount.code.update";
    }

    @Override
    public DiscountCodeUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(DiscountCodeUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

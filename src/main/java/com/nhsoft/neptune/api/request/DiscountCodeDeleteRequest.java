package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.DiscountCodeReadDTOModel;

import java.util.*;

/**
 * delete_5请求类
 * 折扣码删除
 */
public class DiscountCodeDeleteRequest implements ApiCloudRequest<DiscountCodeReadDTOModel, Void> {

    private DiscountCodeReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.discount.code.delete";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

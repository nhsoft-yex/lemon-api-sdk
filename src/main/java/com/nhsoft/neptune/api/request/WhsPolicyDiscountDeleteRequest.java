package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WhsPolicyDiscountDeleteDTOModel;

import java.util.*;

/**
 * delete_1请求类
 * 批发超额折扣删除
 */
public class WhsPolicyDiscountDeleteRequest implements ApiCloudRequest<WhsPolicyDiscountDeleteDTOModel, Void> {

    private WhsPolicyDiscountDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.whs.policy.discount.delete";
    }

    @Override
    public WhsPolicyDiscountDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WhsPolicyDiscountDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

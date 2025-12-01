package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardCategorySaveDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardCategoryVOModel;

import java.util.*;

/**
 * saveGiftCardCategory请求类
 * 创建礼品卡分组
 */
public class CustomerGiftcardCategorySaveRequest implements ApiCloudRequest<GiftCardCategorySaveDTOModel, GiftCardCategoryVOModel> {

    private GiftCardCategorySaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.category.save";
    }

    @Override
    public GiftCardCategorySaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardCategorySaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardCategoryVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardCategoryVOModel>>() {};
    }

}

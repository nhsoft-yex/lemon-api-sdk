package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardCategoryUpdateDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardCategoryVOModel;

import java.util.*;

/**
 * updateGiftCardCategory请求类
 * 修改礼品卡分组
 */
public class CustomerGiftcardCategoryUpdateRequest implements ApiCloudRequest<GiftCardCategoryUpdateDTOModel, GiftCardCategoryVOModel> {

    private GiftCardCategoryUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.category.update";
    }

    @Override
    public GiftCardCategoryUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardCategoryUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardCategoryVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardCategoryVOModel>>() {};
    }

}

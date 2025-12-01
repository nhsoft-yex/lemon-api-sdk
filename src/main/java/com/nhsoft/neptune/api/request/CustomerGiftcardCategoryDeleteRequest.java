package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardCategoryDeleteDTOModel;

import java.util.*;

/**
 * deleteGiftCardCategory请求类
 * 删除礼品卡分组
 */
public class CustomerGiftcardCategoryDeleteRequest implements ApiCloudRequest<GiftCardCategoryDeleteDTOModel, Void> {

    private GiftCardCategoryDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.category.delete";
    }

    @Override
    public GiftCardCategoryDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardCategoryDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

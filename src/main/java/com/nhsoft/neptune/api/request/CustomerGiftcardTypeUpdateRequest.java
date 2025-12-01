package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardTypeUpdateDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardTypeVOModel;

import java.util.*;

/**
 * updateGiftCardType请求类
 * 查询所有礼品卡类型
 */
public class CustomerGiftcardTypeUpdateRequest implements ApiCloudRequest<GiftCardTypeUpdateDTOModel, GiftCardTypeVOModel> {

    private GiftCardTypeUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.type.update";
    }

    @Override
    public GiftCardTypeUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardTypeUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardTypeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardTypeVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardTypeSaveDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardTypeVOModel;

import java.util.*;

/**
 * saveGiftCardType请求类
 * 查询所有礼品卡类型
 */
public class CustomerGiftcardTypeSaveRequest implements ApiCloudRequest<GiftCardTypeSaveDTOModel, GiftCardTypeVOModel> {

    private GiftCardTypeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.type.save";
    }

    @Override
    public GiftCardTypeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardTypeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardTypeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardTypeVOModel>>() {};
    }

}

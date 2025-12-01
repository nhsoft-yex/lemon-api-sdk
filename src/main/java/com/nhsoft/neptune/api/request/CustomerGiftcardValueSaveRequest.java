package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardValueSaveDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardValueVOModel;

import java.util.*;

/**
 * saveGiftCardValue请求类
 * 查询所有礼品卡面值
 */
public class CustomerGiftcardValueSaveRequest implements ApiCloudRequest<GiftCardValueSaveDTOModel, GiftCardValueVOModel> {

    private GiftCardValueSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.value.save";
    }

    @Override
    public GiftCardValueSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardValueSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardValueVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardValueVOModel>>() {};
    }

}

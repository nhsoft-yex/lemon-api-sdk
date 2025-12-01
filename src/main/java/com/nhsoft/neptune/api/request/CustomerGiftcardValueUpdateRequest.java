package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardValueUpdateDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardValueVOModel;

import java.util.*;

/**
 * updateGiftCardValue请求类
 * 查询所有礼品卡面值
 */
public class CustomerGiftcardValueUpdateRequest implements ApiCloudRequest<GiftCardValueUpdateDTOModel, GiftCardValueVOModel> {

    private GiftCardValueUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.value.update";
    }

    @Override
    public GiftCardValueUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardValueUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardValueVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardValueVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardConsumeDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardConsumeVOModel;

import java.util.*;

/**
 * giftCardConsume_1请求类
 * 礼品卡消费
 */
public class CustomerGiftcardConsumeRequest implements ApiCloudRequest<GiftCardConsumeDTOModel, GiftCardConsumeVOModel> {

    private GiftCardConsumeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.consume";
    }

    @Override
    public GiftCardConsumeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardConsumeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardConsumeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardConsumeVOModel>>() {};
    }

}

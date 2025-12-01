package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardUpdateExpireTimeDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardConsumeVOModel;

import java.util.*;

/**
 * giftCardConsume请求类
 * 礼品卡更新过期时间
 */
public class CustomerGiftcardExpiretimeUpdateRequest implements ApiCloudRequest<GiftCardUpdateExpireTimeDTOModel, GiftCardConsumeVOModel> {

    private GiftCardUpdateExpireTimeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.expiretime.update";
    }

    @Override
    public GiftCardUpdateExpireTimeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardUpdateExpireTimeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardConsumeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardConsumeVOModel>>() {};
    }

}

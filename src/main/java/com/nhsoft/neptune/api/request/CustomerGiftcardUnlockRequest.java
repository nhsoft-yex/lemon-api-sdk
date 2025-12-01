package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardLockDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardVOModel;

import java.util.*;

/**
 * unlockGiftCard请求类
 * 会员礼品卡解锁
 */
public class CustomerGiftcardUnlockRequest implements ApiCloudRequest<GiftCardLockDTOModel, GiftCardVOModel> {

    private GiftCardLockDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.unlock";
    }

    @Override
    public GiftCardLockDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardLockDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardVOModel>>() {};
    }

}

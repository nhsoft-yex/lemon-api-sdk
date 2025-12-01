package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardTypeDeleteDTOModel;

import java.util.*;

/**
 * deleteGiftCardType请求类
 * 删除礼品卡类型
 */
public class CustomerGiftcardTypeDeleteRequest implements ApiCloudRequest<GiftCardTypeDeleteDTOModel, Void> {

    private GiftCardTypeDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.type.delete";
    }

    @Override
    public GiftCardTypeDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardTypeDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

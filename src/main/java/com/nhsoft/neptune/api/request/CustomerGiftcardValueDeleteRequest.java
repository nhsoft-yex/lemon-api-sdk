package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardValueDeleteDTOModel;

import java.util.*;

/**
 * deleteGiftCardValue请求类
 * 查询所有礼品卡面值
 */
public class CustomerGiftcardValueDeleteRequest implements ApiCloudRequest<GiftCardValueDeleteDTOModel, Void> {

    private GiftCardValueDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.value.delete";
    }

    @Override
    public GiftCardValueDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardValueDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

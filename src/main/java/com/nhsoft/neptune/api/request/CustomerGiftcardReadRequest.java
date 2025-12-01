package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardReadDTOModel;

import com.nhsoft.neptune.api.domain.GiftCardVOModel;

import java.util.*;

/**
 * readGiftCard请求类
 * 会员礼品卡读取
 */
public class CustomerGiftcardReadRequest implements ApiCloudRequest<GiftCardReadDTOModel, GiftCardVOModel> {

    private GiftCardReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.read";
    }

    @Override
    public GiftCardReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<GiftCardVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<GiftCardVOModel>>() {};
    }

}

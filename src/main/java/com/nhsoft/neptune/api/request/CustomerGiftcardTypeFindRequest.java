package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardTypeVOModel;

import com.nhsoft.neptune.api.domain.GiftCardTypeVOModel;

import java.util.*;

/**
 * findGiftCardType请求类
 * 查询所有礼品卡类型
 */
public class CustomerGiftcardTypeFindRequest implements ApiCloudRequest<Void, List<GiftCardTypeVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.type.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<GiftCardTypeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardTypeVOModel>>>() {};
    }

}

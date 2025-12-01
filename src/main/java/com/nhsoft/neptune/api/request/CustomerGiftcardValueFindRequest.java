package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardValueVOModel;

import com.nhsoft.neptune.api.domain.GiftCardValueVOModel;

import java.util.*;

/**
 * findGiftCardValue请求类
 * 查询所有礼品卡面值
 */
public class CustomerGiftcardValueFindRequest implements ApiCloudRequest<Void, List<GiftCardValueVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.value.find";
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
    public TypeReference<ApiCloudResponse<List<GiftCardValueVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardValueVOModel>>>() {};
    }

}

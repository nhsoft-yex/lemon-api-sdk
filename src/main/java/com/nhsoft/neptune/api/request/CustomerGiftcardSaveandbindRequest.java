package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardBatchCreateWithBindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardCreateWithBindVOModel;

import com.nhsoft.neptune.api.domain.GiftCardCreateWithBindVOModel;

import java.util.*;

/**
 * createAndBindGiftCard请求类
 * 给指定用户发卡并直接绑定
 */
public class CustomerGiftcardSaveandbindRequest implements ApiCloudRequest<GiftCardBatchCreateWithBindDTOModel, List<GiftCardCreateWithBindVOModel>> {

    private GiftCardBatchCreateWithBindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.saveandbind";
    }

    @Override
    public GiftCardBatchCreateWithBindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardBatchCreateWithBindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<GiftCardCreateWithBindVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardCreateWithBindVOModel>>>() {};
    }

}

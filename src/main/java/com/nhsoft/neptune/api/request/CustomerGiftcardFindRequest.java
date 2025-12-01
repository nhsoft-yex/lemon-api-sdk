package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardVOModel;

import com.nhsoft.neptune.api.domain.GiftCardVOModel;

import java.util.*;

/**
 * findGiftCard请求类
 * 会员礼品卡查询
 */
public class CustomerGiftcardFindRequest implements ApiCloudRequest<GiftCardFindDTOModel, List<GiftCardVOModel>> {

    private GiftCardFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.find";
    }

    @Override
    public GiftCardFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<GiftCardVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardVOModel>>>() {};
    }

}

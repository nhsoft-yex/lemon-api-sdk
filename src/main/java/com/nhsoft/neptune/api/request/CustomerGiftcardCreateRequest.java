package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.GiftCardCreateDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.GiftCardVOModel;

import com.nhsoft.neptune.api.domain.GiftCardVOModel;

import java.util.*;

/**
 * createGiftCard请求类
 * 会员礼品卡发卡
 */
public class CustomerGiftcardCreateRequest implements ApiCloudRequest<GiftCardCreateDTOModel, List<GiftCardVOModel>> {

    private GiftCardCreateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.giftcard.create";
    }

    @Override
    public GiftCardCreateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(GiftCardCreateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<GiftCardVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<GiftCardVOModel>>>() {};
    }

}

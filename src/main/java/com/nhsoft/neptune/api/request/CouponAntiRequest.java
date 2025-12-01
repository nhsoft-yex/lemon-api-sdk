package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponAntiDTOModel;

import java.util.*;

/**
 * cardCouponAnti请求类
 * 反核销消费券
 */
public class CouponAntiRequest implements ApiCloudRequest<CardCouponAntiDTOModel, Void> {

    private CardCouponAntiDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.anti";
    }

    @Override
    public CardCouponAntiDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCouponAntiDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

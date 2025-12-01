package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponCancelDTOModel;

import java.util.*;

/**
 * cancelCardCoupon请求类
 * 作废消费券
 */
public class CouponCancelRequest implements ApiCloudRequest<CardCouponCancelDTOModel, Void> {

    private CardCouponCancelDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.cancel";
    }

    @Override
    public CardCouponCancelDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCouponCancelDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

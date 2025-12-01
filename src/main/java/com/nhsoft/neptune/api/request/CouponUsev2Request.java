package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponUseV2DTOModel;

import java.util.*;

/**
 * cardCouponUseV2请求类
 * 核销消费券
 */
public class CouponUsev2Request implements ApiCloudRequest<CardCouponUseV2DTOModel, Void> {

    private CardCouponUseV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.use/v2";
    }

    @Override
    public CardCouponUseV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCouponUseV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponUseV2DTOModel;

import java.util.*;

/**
 * cardCouponUse请求类
 * 核销消费券
 */
public class CouponUseRequest implements ApiCloudRequest<CardCouponUseV2DTOModel, Void> {

    private CardCouponUseV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.use";
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

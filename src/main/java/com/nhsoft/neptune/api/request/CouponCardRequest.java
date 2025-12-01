package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponALLV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import java.util.*;

/**
 * cardCouponALL请求类
 * 根据储值卡读取(有效，已使用，已过期)消费券
 */
public class CouponCardRequest implements ApiCloudRequest<CardCouponALLV2DTOModel, List<TicketSendDetailV2DTOModel>> {

    private CardCouponALLV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.card";
    }

    @Override
    public CardCouponALLV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCouponALLV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponCreateV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import java.util.*;

/**
 * create请求类
 * 创建消费券
 */
public class CouponCreateRequest implements ApiCloudRequest<CardCouponCreateV2DTOModel, List<TicketSendDetailV2DTOModel>> {

    private CardCouponCreateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.create";
    }

    @Override
    public CardCouponCreateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCouponCreateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponCustomerFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import java.util.*;

/**
 * cardCouponCustomer请求类
 * 根据会员读取(有效，已使用，已过期)消费券
 */
public class CouponCustomerRequest implements ApiCloudRequest<CardCouponCustomerFindDTOModel, List<TicketSendDetailV2DTOModel>> {

    private CardCouponCustomerFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.customer";
    }

    @Override
    public CardCouponCustomerFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCouponCustomerFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>>() {};
    }

}

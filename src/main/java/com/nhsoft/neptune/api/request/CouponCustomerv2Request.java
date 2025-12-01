package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponCustomerFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketSendDetailSimpleDTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailSimpleDTOModel;

import java.util.*;

/**
 * find_32请求类
 * 根据会员读取(有效，已使用，已过期)消费券
 */
public class CouponCustomerv2Request implements ApiCloudRequest<CardCouponCustomerFindDTOModel, List<TicketSendDetailSimpleDTOModel>> {

    private CardCouponCustomerFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.customer/v2";
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
    public TypeReference<ApiCloudResponse<List<TicketSendDetailSimpleDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketSendDetailSimpleDTOModel>>>() {};
    }

}

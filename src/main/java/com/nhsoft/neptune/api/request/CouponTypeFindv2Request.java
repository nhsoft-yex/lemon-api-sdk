package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CouponTypeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketTypeV2VOModel;

import com.nhsoft.neptune.api.domain.TicketTypeV2VOModel;

import java.util.*;

/**
 * findCouponTypes_1请求类
 * 查询消费券类型
 */
public class CouponTypeFindv2Request implements ApiCloudRequest<CouponTypeFindDTOModel, List<TicketTypeV2VOModel>> {

    private CouponTypeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.type.find/v2";
    }

    @Override
    public CouponTypeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CouponTypeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TicketTypeV2VOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketTypeV2VOModel>>>() {};
    }

}

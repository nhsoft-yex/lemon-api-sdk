package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketTypeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketTypeV2VOModel;

import com.nhsoft.neptune.api.domain.TicketTypeV2VOModel;

import java.util.*;

/**
 * findCouponTypes请求类
 * 查询消费券类型(该接口不推荐使用)
 */
public class CouponTypeFindRequest implements ApiCloudRequest<TicketTypeFindDTOModel, List<TicketTypeV2VOModel>> {

    private TicketTypeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.type.find";
    }

    @Override
    public TicketTypeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TicketTypeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TicketTypeV2VOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketTypeV2VOModel>>>() {};
    }

}

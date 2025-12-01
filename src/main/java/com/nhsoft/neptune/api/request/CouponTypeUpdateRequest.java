package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketTypeUpdateDTOModel;

import com.nhsoft.neptune.api.domain.TicketTypeV2VOModel;

import java.util.*;

/**
 * updateCouponType请求类
 * 更新消费券类型
 */
public class CouponTypeUpdateRequest implements ApiCloudRequest<TicketTypeUpdateDTOModel, TicketTypeV2VOModel> {

    private TicketTypeUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.type.update";
    }

    @Override
    public TicketTypeUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TicketTypeUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TicketTypeV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TicketTypeV2VOModel>>() {};
    }

}

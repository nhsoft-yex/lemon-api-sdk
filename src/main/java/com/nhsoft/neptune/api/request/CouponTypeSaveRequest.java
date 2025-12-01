package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketTypeSaveDTOModel;

import com.nhsoft.neptune.api.domain.TicketTypeV2VOModel;

import java.util.*;

/**
 * saveCouponType请求类
 * 新增消费券类型
 */
public class CouponTypeSaveRequest implements ApiCloudRequest<TicketTypeSaveDTOModel, TicketTypeV2VOModel> {

    private TicketTypeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.type.save";
    }

    @Override
    public TicketTypeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TicketTypeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TicketTypeV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TicketTypeV2VOModel>>() {};
    }

}

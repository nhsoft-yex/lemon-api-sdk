package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketTypeDeleteDTOModel;

import java.util.*;

/**
 * deleteCouponType请求类
 * 删除消费券类型
 */
public class CouponTypeDeleteRequest implements ApiCloudRequest<TicketTypeDeleteDTOModel, Void> {

    private TicketTypeDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.type.delete";
    }

    @Override
    public TicketTypeDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TicketTypeDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

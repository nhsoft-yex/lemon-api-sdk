package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketSendDetailFindBatchV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import java.util.*;

/**
 * couponFindBatchV2请求类
 * 批量查询消费券
 */
public class CouponFindv2Request implements ApiCloudRequest<TicketSendDetailFindBatchV2DTOModel, List<TicketSendDetailV2DTOModel>> {

    private TicketSendDetailFindBatchV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.find/v2";
    }

    @Override
    public TicketSendDetailFindBatchV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TicketSendDetailFindBatchV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>>() {};
    }

}

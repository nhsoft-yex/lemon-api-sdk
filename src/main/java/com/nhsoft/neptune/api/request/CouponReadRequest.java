package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketSendPrintNumV2DTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import java.util.*;

/**
 * cardTicketUuid请求类
 * 根据消费券的表面卡号读取消费券
 */
public class CouponReadRequest implements ApiCloudRequest<TicketSendPrintNumV2DTOModel, TicketSendDetailV2DTOModel> {

    private TicketSendPrintNumV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.read";
    }

    @Override
    public TicketSendPrintNumV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TicketSendPrintNumV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TicketSendDetailV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TicketSendDetailV2DTOModel>>() {};
    }

}

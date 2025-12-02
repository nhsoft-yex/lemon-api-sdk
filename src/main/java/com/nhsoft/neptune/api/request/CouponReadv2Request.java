package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketSendPrintNumV2DTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailSimpleDTOModel;

import java.util.*;

/**
 * read_26请求类
 * 根据消费券的表面卡号读取消费券
 */
public class CouponReadv2Request implements ApiCloudRequest<TicketSendPrintNumV2DTOModel, TicketSendDetailSimpleDTOModel> {

    private TicketSendPrintNumV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.read/v2";
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
    public TypeReference<ApiCloudResponse<TicketSendDetailSimpleDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TicketSendDetailSimpleDTOModel>>() {};
    }

}

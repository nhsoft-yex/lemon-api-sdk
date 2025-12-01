package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TicketSendDetailFindBatchDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import com.nhsoft.neptune.api.domain.TicketSendDetailV2DTOModel;

import java.util.*;

/**
 * couponFindBatch请求类
 * 批量查询消费券
 */
public class CouponFindRequest implements ApiCloudRequest<TicketSendDetailFindBatchDTOModel, List<TicketSendDetailV2DTOModel>> {

    private TicketSendDetailFindBatchDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.find";
    }

    @Override
    public TicketSendDetailFindBatchDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TicketSendDetailFindBatchDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TicketSendDetailV2DTOModel>>>() {};
    }

}

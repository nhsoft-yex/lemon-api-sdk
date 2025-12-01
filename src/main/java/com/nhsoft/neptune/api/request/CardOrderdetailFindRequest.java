package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.OrderDetailDTOModel;

import com.nhsoft.neptune.api.domain.OrderDetailDTOModel;

import java.util.*;

/**
 * findOrderDetail请求类
 * 会员订单明细查询
 */
public class CardOrderdetailFindRequest implements ApiCloudRequest<OrderDetailFindDTOModel, List<OrderDetailDTOModel>> {

    private OrderDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.orderdetail.find";
    }

    @Override
    public OrderDetailFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderDetailFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<OrderDetailDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<OrderDetailDTOModel>>>() {};
    }

}

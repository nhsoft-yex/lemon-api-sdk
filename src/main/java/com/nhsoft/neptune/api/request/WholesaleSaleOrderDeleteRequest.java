package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderFidDTOModel;

import java.util.*;

/**
 * saleOrderDelete请求类
 * 批发销售单删除
 */
public class WholesaleSaleOrderDeleteRequest implements ApiCloudRequest<OrderFidDTOModel, Void> {

    private OrderFidDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.sale.order.delete";
    }

    @Override
    public OrderFidDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderFidDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

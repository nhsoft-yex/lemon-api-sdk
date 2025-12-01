package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderInvoiceReadDTOModel;

import com.nhsoft.neptune.api.domain.OrderInvoiceResponseDTOModel;

import java.util.*;

/**
 * findOrderInvoice请求类
 * 发票信息读取
 */
public class SettlementInvoiceReadRequest implements ApiCloudRequest<OrderInvoiceReadDTOModel, OrderInvoiceResponseDTOModel> {

    private OrderInvoiceReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.invoice.read";
    }

    @Override
    public OrderInvoiceReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderInvoiceReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OrderInvoiceResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OrderInvoiceResponseDTOModel>>() {};
    }

}

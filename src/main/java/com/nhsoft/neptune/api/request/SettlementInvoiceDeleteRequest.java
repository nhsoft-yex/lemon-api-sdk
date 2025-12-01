package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderInvoiceDeleteDTOModel;

import com.nhsoft.neptune.api.domain.OrderInvoiceResponseDTOModel;

import java.util.*;

/**
 * deleteOrderInvoice请求类
 * 发票信息删除
 */
public class SettlementInvoiceDeleteRequest implements ApiCloudRequest<OrderInvoiceDeleteDTOModel, OrderInvoiceResponseDTOModel> {

    private OrderInvoiceDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.invoice.delete";
    }

    @Override
    public OrderInvoiceDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderInvoiceDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OrderInvoiceResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OrderInvoiceResponseDTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderInvoiceSaveRequestDTOModel;

import com.nhsoft.neptune.api.domain.OrderInvoiceResponseDTOModel;

import java.util.*;

/**
 * saveOrderInvoice请求类
 * 发票信息录入
 */
public class SettlementInvoiceSaveRequest implements ApiCloudRequest<OrderInvoiceSaveRequestDTOModel, OrderInvoiceResponseDTOModel> {

    private OrderInvoiceSaveRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.invoice.save";
    }

    @Override
    public OrderInvoiceSaveRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderInvoiceSaveRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OrderInvoiceResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OrderInvoiceResponseDTOModel>>() {};
    }

}

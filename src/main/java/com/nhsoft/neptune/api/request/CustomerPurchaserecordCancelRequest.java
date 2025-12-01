package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerPayOrderCancelDTOModel;

import java.util.*;

/**
 * cancelPayOrder请求类
 * 取消付费会员订单
 */
public class CustomerPurchaserecordCancelRequest implements ApiCloudRequest<CustomerPayOrderCancelDTOModel, Void> {

    private CustomerPayOrderCancelDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.purchaserecord.cancel";
    }

    @Override
    public CustomerPayOrderCancelDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerPayOrderCancelDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

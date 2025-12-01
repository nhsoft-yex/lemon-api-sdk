package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerPayOrderCreateDTOModel;

import java.util.*;

/**
 * createPayOrder请求类
 * 创建付费会员订单
 */
public class CustomerPurchaserecordCreateRequest implements ApiCloudRequest<CustomerPayOrderCreateDTOModel, Void> {

    private CustomerPayOrderCreateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.purchaserecord.create";
    }

    @Override
    public CustomerPayOrderCreateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerPayOrderCreateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

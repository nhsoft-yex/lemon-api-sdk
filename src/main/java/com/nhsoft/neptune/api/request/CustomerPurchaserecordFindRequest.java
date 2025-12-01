package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerPayRecordFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CustomerPayRecordVOModel;

import com.nhsoft.neptune.api.domain.CustomerPayRecordVOModel;

import java.util.*;

/**
 * findPayOrder请求类
 * 付费会员订单记录查询
 */
public class CustomerPurchaserecordFindRequest implements ApiCloudRequest<CustomerPayRecordFindDTOModel, List<CustomerPayRecordVOModel>> {

    private CustomerPayRecordFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.purchaserecord.find";
    }

    @Override
    public CustomerPayRecordFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerPayRecordFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CustomerPayRecordVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CustomerPayRecordVOModel>>>() {};
    }

}

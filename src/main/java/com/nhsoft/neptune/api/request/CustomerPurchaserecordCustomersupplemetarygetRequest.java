package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerSupplementFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CustomerPayRecordSupplementaryVOModel;

import com.nhsoft.neptune.api.domain.CustomerPayRecordSupplementaryVOModel;

import java.util.*;

/**
 * findCustomerSupplementary请求类
 * 付费会员附属卡记录查询
 */
public class CustomerPurchaserecordCustomersupplemetarygetRequest implements ApiCloudRequest<CustomerSupplementFindDTOModel, List<CustomerPayRecordSupplementaryVOModel>> {

    private CustomerSupplementFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.purchaserecord.customersupplemetaryget";
    }

    @Override
    public CustomerSupplementFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerSupplementFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CustomerPayRecordSupplementaryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CustomerPayRecordSupplementaryVOModel>>>() {};
    }

}

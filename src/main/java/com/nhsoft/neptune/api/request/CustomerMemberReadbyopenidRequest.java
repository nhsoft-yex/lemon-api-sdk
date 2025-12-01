package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerReadByOpenidDTOModel;

import com.nhsoft.neptune.api.domain.CustomerByOpenidVOModel;

import java.util.*;

/**
 * readMemberByOpenid请求类
 * 根据openid查询会员
 */
public class CustomerMemberReadbyopenidRequest implements ApiCloudRequest<CustomerReadByOpenidDTOModel, CustomerByOpenidVOModel> {

    private CustomerReadByOpenidDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.readbyopenid";
    }

    @Override
    public CustomerReadByOpenidDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerReadByOpenidDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CustomerByOpenidVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CustomerByOpenidVOModel>>() {};
    }

}

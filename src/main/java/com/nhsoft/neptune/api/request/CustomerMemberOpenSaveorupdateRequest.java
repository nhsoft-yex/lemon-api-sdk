package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerSourceSaveDTOModel;

import java.util.*;

/**
 * sourceUpdate请求类
 * 会员来源信息保存
 */
public class CustomerMemberOpenSaveorupdateRequest implements ApiCloudRequest<CustomerSourceSaveDTOModel, Void> {

    private CustomerSourceSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.open.saveorupdate";
    }

    @Override
    public CustomerSourceSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerSourceSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

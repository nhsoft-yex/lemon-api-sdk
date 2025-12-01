package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerSourceDeleteDTOModel;

import java.util.*;

/**
 * sourceDelete请求类
 * 会员来源信息删除
 */
public class CustomerMemberOpenDeleteRequest implements ApiCloudRequest<CustomerSourceDeleteDTOModel, Void> {

    private CustomerSourceDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.open.delete";
    }

    @Override
    public CustomerSourceDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerSourceDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

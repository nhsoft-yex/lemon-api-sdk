package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberSaveDTOModel;

import com.nhsoft.neptune.api.domain.MemberV2VOModel;

import java.util.*;

/**
 * createMember请求类
 * 会员创建
 */
public class CustomerMemberCreateRequest implements ApiCloudRequest<MemberSaveDTOModel, MemberV2VOModel> {

    private MemberSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.create";
    }

    @Override
    public MemberSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberV2VOModel>>() {};
    }

}

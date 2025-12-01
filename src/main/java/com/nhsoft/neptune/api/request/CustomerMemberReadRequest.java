package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberReadDTOModel;

import com.nhsoft.neptune.api.domain.MemberV2VOModel;

import java.util.*;

/**
 * readMemberByPhone请求类
 * 根据手机号或会员ID读取全渠道会员信息
 */
public class CustomerMemberReadRequest implements ApiCloudRequest<MemberReadDTOModel, MemberV2VOModel> {

    private MemberReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.read";
    }

    @Override
    public MemberReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberV2VOModel>>() {};
    }

}

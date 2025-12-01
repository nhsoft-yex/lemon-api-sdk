package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberPhoneUpdateDTOModel;

import com.nhsoft.neptune.api.domain.MemberV2VOModel;

import java.util.*;

/**
 * updateMemberPhone请求类
 * 会员手机号修改
 */
public class CustomerMemberPhoneUpdateRequest implements ApiCloudRequest<MemberPhoneUpdateDTOModel, MemberV2VOModel> {

    private MemberPhoneUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.phone.update";
    }

    @Override
    public MemberPhoneUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberPhoneUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberV2VOModel>>() {};
    }

}

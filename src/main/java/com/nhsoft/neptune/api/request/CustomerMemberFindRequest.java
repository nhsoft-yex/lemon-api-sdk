package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberFindDTOModel;

import java.util.*;

/**
 * findMembers请求类
 * 查询全渠道会员信息
 */
public class CustomerMemberFindRequest implements ApiCloudRequest<MemberFindDTOModel, Object> {

    private MemberFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.member.find";
    }

    @Override
    public MemberFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

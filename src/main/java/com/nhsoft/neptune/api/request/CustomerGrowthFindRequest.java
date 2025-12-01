package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberGrowthFindDTOModel;

import java.util.*;

/**
 * findMemberGrowth请求类
 * 查询全渠道会员成长值记录
 */
public class CustomerGrowthFindRequest implements ApiCloudRequest<MemberGrowthFindDTOModel, Object> {

    private MemberGrowthFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.growth.find";
    }

    @Override
    public MemberGrowthFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberGrowthFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

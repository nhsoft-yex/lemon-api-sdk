package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberPointFindDTOModel;

import java.util.*;

/**
 * findMemberPoint请求类
 * 全渠道会员积分明细查询
 */
public class CustomerPointFindRequest implements ApiCloudRequest<MemberPointFindDTOModel, Object> {

    private MemberPointFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.point.find";
    }

    @Override
    public MemberPointFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberPointFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

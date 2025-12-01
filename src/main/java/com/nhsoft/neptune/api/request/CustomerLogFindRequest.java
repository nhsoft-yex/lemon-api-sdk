package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberLogFindDTOModel;

import java.util.*;

/**
 * findMemberLog请求类
 * 查询全渠道会员信息修改记录
 */
public class CustomerLogFindRequest implements ApiCloudRequest<MemberLogFindDTOModel, Object> {

    private MemberLogFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.log.find";
    }

    @Override
    public MemberLogFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberLogFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

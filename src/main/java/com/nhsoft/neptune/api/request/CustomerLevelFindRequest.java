package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberLevelFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberLevelVOModel;

import com.nhsoft.neptune.api.domain.MemberLevelVOModel;

import java.util.*;

/**
 * findCrmLevel请求类
 * 全渠道会员等级查询
 */
public class CustomerLevelFindRequest implements ApiCloudRequest<MemberLevelFindDTOModel, List<MemberLevelVOModel>> {

    private MemberLevelFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.level.find";
    }

    @Override
    public MemberLevelFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberLevelFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberLevelVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberLevelVOModel>>>() {};
    }

}

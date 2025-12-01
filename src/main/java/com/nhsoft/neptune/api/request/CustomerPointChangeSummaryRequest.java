package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberPointSummaryChangeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberPointSummaryChangeVOModel;

import com.nhsoft.neptune.api.domain.MemberPointSummaryChangeVOModel;

import java.util.*;

/**
 * summaryCustomerPointChange请求类
 * 按会员等级积分变动汇总
 */
public class CustomerPointChangeSummaryRequest implements ApiCloudRequest<MemberPointSummaryChangeFindDTOModel, List<MemberPointSummaryChangeVOModel>> {

    private MemberPointSummaryChangeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.point.change.summary";
    }

    @Override
    public MemberPointSummaryChangeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberPointSummaryChangeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberPointSummaryChangeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberPointSummaryChangeVOModel>>>() {};
    }

}

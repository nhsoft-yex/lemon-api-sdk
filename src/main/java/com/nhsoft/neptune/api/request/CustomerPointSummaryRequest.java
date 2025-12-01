package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.MemberPointSummaryVOModel;

import com.nhsoft.neptune.api.domain.MemberPointSummaryVOModel;

import java.util.*;

/**
 * summaryCustomerPoint请求类
 * 按会员等级积分汇总
 */
public class CustomerPointSummaryRequest implements ApiCloudRequest<Void, List<MemberPointSummaryVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.point.summary";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberPointSummaryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberPointSummaryVOModel>>>() {};
    }

}

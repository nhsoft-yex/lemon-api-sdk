package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponConsumeQueryDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberCouponConsumeVOModel;

import com.nhsoft.neptune.api.domain.MemberCouponConsumeVOModel;

import java.util.*;

/**
 * findConsumeCoupon请求类
 * 查询已核销消费券记录(时间范围查询)
 */
public class CouponCenterConsumecouponFindRequest implements ApiCloudRequest<MemberCouponConsumeQueryDTOModel, List<MemberCouponConsumeVOModel>> {

    private MemberCouponConsumeQueryDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.consumecoupon.find";
    }

    @Override
    public MemberCouponConsumeQueryDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponConsumeQueryDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberCouponConsumeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberCouponConsumeVOModel>>>() {};
    }

}

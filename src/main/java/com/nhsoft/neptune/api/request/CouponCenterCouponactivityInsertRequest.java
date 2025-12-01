package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponActivityInsertDTOModel;

import com.nhsoft.neptune.api.domain.MemberCouponActivityVOModel;

import java.util.*;

/**
 * createCouponActivity请求类
 * 创建营销活动
 */
public class CouponCenterCouponactivityInsertRequest implements ApiCloudRequest<MemberCouponActivityInsertDTOModel, MemberCouponActivityVOModel> {

    private MemberCouponActivityInsertDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.couponactivity.insert";
    }

    @Override
    public MemberCouponActivityInsertDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponActivityInsertDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberCouponActivityVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberCouponActivityVOModel>>() {};
    }

}

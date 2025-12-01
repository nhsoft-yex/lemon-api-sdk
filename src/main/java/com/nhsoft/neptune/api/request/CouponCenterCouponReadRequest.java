package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponReadDTOModel;

import com.nhsoft.neptune.api.domain.MemberCouponConsumeVOModel;

import java.util.*;

/**
 * readCoupon请求类
 * (券中心)根据券码读取消费券
 */
public class CouponCenterCouponReadRequest implements ApiCloudRequest<MemberCouponReadDTOModel, MemberCouponConsumeVOModel> {

    private MemberCouponReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupon.read";
    }

    @Override
    public MemberCouponReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberCouponConsumeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberCouponConsumeVOModel>>() {};
    }

}

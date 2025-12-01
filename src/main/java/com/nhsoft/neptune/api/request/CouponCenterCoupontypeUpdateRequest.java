package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponTypeUpdateDTOModel;

import com.nhsoft.neptune.api.domain.MemberCouponTypeVOModel;

import java.util.*;

/**
 * updateCouponType_1请求类
 * 消费券类型修改
 */
public class CouponCenterCoupontypeUpdateRequest implements ApiCloudRequest<MemberCouponTypeUpdateDTOModel, MemberCouponTypeVOModel> {

    private MemberCouponTypeUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupontype.update";
    }

    @Override
    public MemberCouponTypeUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponTypeUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberCouponTypeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberCouponTypeVOModel>>() {};
    }

}

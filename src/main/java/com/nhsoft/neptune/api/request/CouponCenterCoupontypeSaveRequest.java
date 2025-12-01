package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponTypeSaveDTOModel;

import com.nhsoft.neptune.api.domain.MemberCouponTypeVOModel;

import java.util.*;

/**
 * saveCouponType_1请求类
 * 消费券类型新增
 */
public class CouponCenterCoupontypeSaveRequest implements ApiCloudRequest<MemberCouponTypeSaveDTOModel, MemberCouponTypeVOModel> {

    private MemberCouponTypeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupontype.save";
    }

    @Override
    public MemberCouponTypeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponTypeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MemberCouponTypeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MemberCouponTypeVOModel>>() {};
    }

}

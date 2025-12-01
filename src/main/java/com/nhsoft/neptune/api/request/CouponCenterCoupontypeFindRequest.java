package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponTypeQueryDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberCouponTypeVOModel;

import com.nhsoft.neptune.api.domain.MemberCouponTypeVOModel;

import java.util.*;

/**
 * findCouponType请求类
 * 消费券类型查询
 */
public class CouponCenterCoupontypeFindRequest implements ApiCloudRequest<MemberCouponTypeQueryDTOModel, List<MemberCouponTypeVOModel>> {

    private MemberCouponTypeQueryDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupontype.find";
    }

    @Override
    public MemberCouponTypeQueryDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponTypeQueryDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberCouponTypeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberCouponTypeVOModel>>>() {};
    }

}

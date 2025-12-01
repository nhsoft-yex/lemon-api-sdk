package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponCreateDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MemberCouponDetailVOModel;

import com.nhsoft.neptune.api.domain.MemberCouponDetailVOModel;

import java.util.*;

/**
 * createCoupon请求类
 * 创建消费券
 */
public class CouponCenterInsertRequest implements ApiCloudRequest<MemberCouponCreateDTOModel, List<MemberCouponDetailVOModel>> {

    private MemberCouponCreateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.insert";
    }

    @Override
    public MemberCouponCreateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponCreateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MemberCouponDetailVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MemberCouponDetailVOModel>>>() {};
    }

}

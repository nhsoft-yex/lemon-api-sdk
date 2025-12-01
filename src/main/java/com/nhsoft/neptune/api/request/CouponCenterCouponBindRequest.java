package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponBindDTOModel;

import java.util.*;

/**
 * bindCoupon请求类
 * 券绑定会员
 */
public class CouponCenterCouponBindRequest implements ApiCloudRequest<MemberCouponBindDTOModel, Object> {

    private MemberCouponBindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupon.bind";
    }

    @Override
    public MemberCouponBindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponBindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

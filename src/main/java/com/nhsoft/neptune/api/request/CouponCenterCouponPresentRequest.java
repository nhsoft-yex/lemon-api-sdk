package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CouponPresentDTOModel;

import java.util.*;

/**
 * presentCoupon请求类
 * 券转赠
 */
public class CouponCenterCouponPresentRequest implements ApiCloudRequest<CouponPresentDTOModel, Object> {

    private CouponPresentDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupon.present";
    }

    @Override
    public CouponPresentDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CouponPresentDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

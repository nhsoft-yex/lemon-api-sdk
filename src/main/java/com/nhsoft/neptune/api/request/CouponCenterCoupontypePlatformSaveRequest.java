package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCouponTypePlatformSaveDTOModel;

import java.util.*;

/**
 * savePlatform2CouponType请求类
 * 消费券类型新增第三方平台信息
 */
public class CouponCenterCoupontypePlatformSaveRequest implements ApiCloudRequest<MemberCouponTypePlatformSaveDTOModel, Object> {

    private MemberCouponTypePlatformSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.center.coupontype.platform.save";
    }

    @Override
    public MemberCouponTypePlatformSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCouponTypePlatformSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

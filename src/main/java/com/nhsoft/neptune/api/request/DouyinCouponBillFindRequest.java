package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PlatformCouponBillFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PlatformCouponBillVOModel;

import com.nhsoft.neptune.api.domain.PlatformCouponBillVOModel;

import java.util.*;

/**
 * findPlatformCouponBill请求类
 * 抖音券对账
 */
public class DouyinCouponBillFindRequest implements ApiCloudRequest<PlatformCouponBillFindDTOModel, List<PlatformCouponBillVOModel>> {

    private PlatformCouponBillFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.douyin.coupon.bill.find";
    }

    @Override
    public PlatformCouponBillFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PlatformCouponBillFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PlatformCouponBillVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PlatformCouponBillVOModel>>>() {};
    }

}

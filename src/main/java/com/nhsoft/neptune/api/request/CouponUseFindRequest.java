package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCouponUseFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardCouponDetailV2DTOModel;

import com.nhsoft.neptune.api.domain.CardCouponDetailV2DTOModel;

import java.util.*;

/**
 * cardCouponUseFind请求类
 * 消费券核销记录
 */
public class CouponUseFindRequest implements ApiCloudRequest<CardCouponUseFindDTOModel, List<CardCouponDetailV2DTOModel>> {

    private CardCouponUseFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.coupon.use.find";
    }

    @Override
    public CardCouponUseFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCouponUseFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardCouponDetailV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardCouponDetailV2DTOModel>>>() {};
    }

}

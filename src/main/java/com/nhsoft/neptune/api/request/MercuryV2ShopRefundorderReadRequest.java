package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SaleOrderReadV2DTOModel;

import com.nhsoft.neptune.api.domain.SaleRefundOrderV2VOModel;

import java.util.*;

/**
 * readRefundOrderV2请求类
 * 退货订单读取
 */
public class MercuryV2ShopRefundorderReadRequest implements ApiCloudRequest<SaleOrderReadV2DTOModel, SaleRefundOrderV2VOModel> {

    private SaleOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.v2.shop.refundorder.read";
    }

    @Override
    public SaleOrderReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SaleOrderReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SaleRefundOrderV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SaleRefundOrderV2VOModel>>() {};
    }

}

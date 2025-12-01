package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SaleOrderReadV2DTOModel;

import com.nhsoft.neptune.api.domain.SaleOrderV2VOModel;

import java.util.*;

/**
 * readSaleOrderV2请求类
 * 订单读取
 */
public class MercuryV2ShopSaleorderReadRequest implements ApiCloudRequest<SaleOrderReadV2DTOModel, SaleOrderV2VOModel> {

    private SaleOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.v2.shop.saleorder.read";
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
    public TypeReference<ApiCloudResponse<SaleOrderV2VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SaleOrderV2VOModel>>() {};
    }

}

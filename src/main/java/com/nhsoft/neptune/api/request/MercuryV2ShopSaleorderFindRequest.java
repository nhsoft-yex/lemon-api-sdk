package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SaleOrderFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SaleOrderV2VOModel;

import com.nhsoft.neptune.api.domain.SaleOrderV2VOModel;

import java.util.*;

/**
 * findSaleOrderV2请求类
 * 订单查询
 */
public class MercuryV2ShopSaleorderFindRequest implements ApiCloudRequest<SaleOrderFindV2DTOModel, List<SaleOrderV2VOModel>> {

    private SaleOrderFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.v2.shop.saleorder.find";
    }

    @Override
    public SaleOrderFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SaleOrderFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SaleOrderV2VOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SaleOrderV2VOModel>>>() {};
    }

}

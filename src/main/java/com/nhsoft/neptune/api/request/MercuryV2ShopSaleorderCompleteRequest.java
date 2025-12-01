package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SaleOrderCompleteV2DTOModel;

import java.util.*;

/**
 * completeSaleOrderV2请求类
 * 订单核销
 */
public class MercuryV2ShopSaleorderCompleteRequest implements ApiCloudRequest<SaleOrderCompleteV2DTOModel, Object> {

    private SaleOrderCompleteV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.v2.shop.saleorder.complete";
    }

    @Override
    public SaleOrderCompleteV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SaleOrderCompleteV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

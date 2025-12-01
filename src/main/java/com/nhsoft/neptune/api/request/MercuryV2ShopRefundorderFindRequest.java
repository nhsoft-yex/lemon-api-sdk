package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SaleReturnOrderFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SaleRefundOrderV2VOModel;

import com.nhsoft.neptune.api.domain.SaleRefundOrderV2VOModel;

import java.util.*;

/**
 * findRefundOrderV2请求类
 * 退货订单查询
 */
public class MercuryV2ShopRefundorderFindRequest implements ApiCloudRequest<SaleReturnOrderFindV2DTOModel, List<SaleRefundOrderV2VOModel>> {

    private SaleReturnOrderFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.v2.shop.refundorder.find";
    }

    @Override
    public SaleReturnOrderFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SaleReturnOrderFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SaleRefundOrderV2VOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SaleRefundOrderV2VOModel>>>() {};
    }

}

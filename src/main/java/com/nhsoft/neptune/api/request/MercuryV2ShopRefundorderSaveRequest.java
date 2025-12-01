package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SaleRefundOrderSaveDTOModel;

import java.util.*;

/**
 * saveRefundOrder请求类
 * 订单退款
 */
public class MercuryV2ShopRefundorderSaveRequest implements ApiCloudRequest<SaleRefundOrderSaveDTOModel, Object> {

    private SaleRefundOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.v2.shop.refundorder.save";
    }

    @Override
    public SaleRefundOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SaleRefundOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

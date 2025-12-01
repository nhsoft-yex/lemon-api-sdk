package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderReadV3DTOModel;

import com.nhsoft.neptune.api.domain.PurchaseOrderFindV3DTOModel;

import java.util.*;

/**
 * purchaseOrderRead请求类
 * 采购订单读取
 */
public class PurchaseOrderReadRequest implements ApiCloudRequest<PurchaseOrderReadV3DTOModel, PurchaseOrderFindV3DTOModel> {

    private PurchaseOrderReadV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.read";
    }

    @Override
    public PurchaseOrderReadV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseOrderReadV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderSaveV3DTOModel;

import com.nhsoft.neptune.api.domain.PurchaseOrderFindV3DTOModel;

import java.util.*;

/**
 * purchaseOrderSave请求类
 * 采购订单新增
 */
public class PurchaseOrderSaveRequest implements ApiCloudRequest<PurchaseOrderSaveV3DTOModel, PurchaseOrderFindV3DTOModel> {

    private PurchaseOrderSaveV3DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.save";
    }

    @Override
    public PurchaseOrderSaveV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseOrderSaveV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>>() {};
    }

}

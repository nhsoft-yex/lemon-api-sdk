package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderSaveV3DTOModel;

import com.nhsoft.neptune.api.domain.PurchaseOrderFindV3DTOModel;

import java.util.*;

/**
 * purchaseOrderSaveAndAudit请求类
 * 采购订单新增并审核
 */
public class PurchaseOrderSaveandauditRequest implements ApiCloudRequest<PurchaseOrderSaveV3DTOModel, PurchaseOrderFindV3DTOModel> {

    private PurchaseOrderSaveV3DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.saveandaudit";
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

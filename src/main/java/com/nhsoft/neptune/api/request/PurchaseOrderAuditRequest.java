package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderUpdateV3DTOModel;

import com.nhsoft.neptune.api.domain.PurchaseOrderFindV3DTOModel;

import java.util.*;

/**
 * purchaseOrderAudit请求类
 * 采购订单审核
 */
public class PurchaseOrderAuditRequest implements ApiCloudRequest<PurchaseOrderUpdateV3DTOModel, PurchaseOrderFindV3DTOModel> {

    private PurchaseOrderUpdateV3DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.audit";
    }

    @Override
    public PurchaseOrderUpdateV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseOrderUpdateV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>>() {};
    }

}

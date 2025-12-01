package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderCancelV2DTOModel;

import com.nhsoft.neptune.api.domain.PurchaseOrderFindV3DTOModel;

import java.util.*;

/**
 * purchaseOrderCancel请求类
 * 采购订单作废
 */
public class PurchaseOrderCancelRequest implements ApiCloudRequest<PurchaseOrderCancelV2DTOModel, PurchaseOrderFindV3DTOModel> {

    private PurchaseOrderCancelV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.cancel";
    }

    @Override
    public PurchaseOrderCancelV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseOrderCancelV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseOrderFindV3DTOModel>>() {};
    }

}

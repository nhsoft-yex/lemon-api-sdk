package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseOrderFindV3DTOModel;

import com.nhsoft.neptune.api.domain.PurchaseOrderFindV3DTOModel;

import java.util.*;

/**
 * findPurchaseOrder请求类
 * 采购订单查询
 */
public class PurchaseOrderFindRequest implements ApiCloudRequest<PurchaseFindV3DTOModel, List<PurchaseOrderFindV3DTOModel>> {

    private PurchaseFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.find";
    }

    @Override
    public PurchaseFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseOrderFindV3DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseOrderFindV3DTOModel>>>() {};
    }

}

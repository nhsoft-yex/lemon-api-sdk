package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseOrderDeleteV2DTOModel;

import java.util.*;

/**
 * purchaseOrderDelete请求类
 * 采购订单删除
 */
public class PurchaseOrderDeleteRequest implements ApiCloudRequest<PurchaseOrderDeleteV2DTOModel, Void> {

    private PurchaseOrderDeleteV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.order.delete";
    }

    @Override
    public PurchaseOrderDeleteV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseOrderDeleteV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

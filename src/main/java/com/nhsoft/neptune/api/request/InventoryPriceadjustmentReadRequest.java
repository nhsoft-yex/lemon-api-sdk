package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AdjustmentReadV2DTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderV3DTOModel;

import java.util.*;

/**
 * priceadjustmentRead请求类
 * 库存成本调整单读取
 */
public class InventoryPriceadjustmentReadRequest implements ApiCloudRequest<AdjustmentReadV2DTOModel, PriceAdjustmentOrderV3DTOModel> {

    private AdjustmentReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.priceadjustment.read";
    }

    @Override
    public AdjustmentReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AdjustmentReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PriceAdjustmentOrderV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PriceAdjustmentOrderV3DTOModel>>() {};
    }

}

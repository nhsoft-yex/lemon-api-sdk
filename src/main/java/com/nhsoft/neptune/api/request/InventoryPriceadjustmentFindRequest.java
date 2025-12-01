package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderV3DTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderV3DTOModel;

import java.util.*;

/**
 * priceadjustmentFind请求类
 * 库存成本调整单查询
 */
public class InventoryPriceadjustmentFindRequest implements ApiCloudRequest<PriceAdjustmentFindV2DTOModel, List<PriceAdjustmentOrderV3DTOModel>> {

    private PriceAdjustmentFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.priceadjustment.find";
    }

    @Override
    public PriceAdjustmentFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PriceAdjustmentOrderV3DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PriceAdjustmentOrderV3DTOModel>>>() {};
    }

}

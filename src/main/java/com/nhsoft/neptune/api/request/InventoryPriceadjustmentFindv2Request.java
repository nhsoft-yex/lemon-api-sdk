package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderV3DTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderV3DTOModel;

import java.util.*;

/**
 * priceadjustmentFindV2请求类
 * 库存成本调整单查询
 */
public class InventoryPriceadjustmentFindv2Request implements ApiCloudRequest<PriceAdjustmentFindV3DTOModel, List<PriceAdjustmentOrderV3DTOModel>> {

    private PriceAdjustmentFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.priceadjustment.find/v2";
    }

    @Override
    public PriceAdjustmentFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PriceAdjustmentOrderV3DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PriceAdjustmentOrderV3DTOModel>>>() {};
    }

}

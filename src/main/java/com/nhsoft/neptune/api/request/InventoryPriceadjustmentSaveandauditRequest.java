package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderSaveV3DTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderV3DTOModel;

import java.util.*;

/**
 * priceadjustmentSaveAndAudit请求类
 * 库存成本调整单保存并审核
 */
public class InventoryPriceadjustmentSaveandauditRequest implements ApiCloudRequest<PriceAdjustmentOrderSaveV3DTOModel, PriceAdjustmentOrderV3DTOModel> {

    private PriceAdjustmentOrderSaveV3DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.priceadjustment.saveandaudit";
    }

    @Override
    public PriceAdjustmentOrderSaveV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentOrderSaveV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PriceAdjustmentOrderV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PriceAdjustmentOrderV3DTOModel>>() {};
    }

}

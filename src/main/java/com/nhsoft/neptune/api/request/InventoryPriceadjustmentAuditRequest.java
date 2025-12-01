package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderUpdateV3DTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentOrderV3DTOModel;

import java.util.*;

/**
 * priceadjustmentAudit请求类
 * 库存成本调整单审核
 */
public class InventoryPriceadjustmentAuditRequest implements ApiCloudRequest<PriceAdjustmentOrderUpdateV3DTOModel, PriceAdjustmentOrderV3DTOModel> {

    private PriceAdjustmentOrderUpdateV3DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.priceadjustment.audit";
    }

    @Override
    public PriceAdjustmentOrderUpdateV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentOrderUpdateV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PriceAdjustmentOrderV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PriceAdjustmentOrderV3DTOModel>>() {};
    }

}

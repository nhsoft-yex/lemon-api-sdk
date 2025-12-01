package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AdjustmentOrderSaveV3DTOModel;

import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import java.util.*;

/**
 * adjustmentSave请求类
 * 库存调整单保存
 */
public class InventoryAdjustmentSaveRequest implements ApiCloudRequest<AdjustmentOrderSaveV3DTOModel, AdjustmentOrderVOModel> {

    private AdjustmentOrderSaveV3DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustment.save";
    }

    @Override
    public AdjustmentOrderSaveV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AdjustmentOrderSaveV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AdjustmentOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AdjustmentOrderVOModel>>() {};
    }

}

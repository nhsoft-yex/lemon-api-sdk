package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AdjustmentOrderUpdateV3DTOModel;

import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import java.util.*;

/**
 * adjustmentUpdate请求类
 * 库存调整单修改
 */
public class InventoryAdjustmentUpdateRequest implements ApiCloudRequest<AdjustmentOrderUpdateV3DTOModel, AdjustmentOrderVOModel> {

    private AdjustmentOrderUpdateV3DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustment.update";
    }

    @Override
    public AdjustmentOrderUpdateV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AdjustmentOrderUpdateV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AdjustmentOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AdjustmentOrderVOModel>>() {};
    }

}

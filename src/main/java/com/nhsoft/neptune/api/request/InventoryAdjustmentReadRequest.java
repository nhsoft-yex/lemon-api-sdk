package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AdjustmentReadV2DTOModel;

import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import java.util.*;

/**
 * adjustmentRead请求类
 * 库存调整单读取
 */
public class InventoryAdjustmentReadRequest implements ApiCloudRequest<AdjustmentReadV2DTOModel, AdjustmentOrderVOModel> {

    private AdjustmentReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustment.read";
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
    public TypeReference<ApiCloudResponse<AdjustmentOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AdjustmentOrderVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AdjustmentFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import java.util.*;

/**
 * adjustmentFind请求类
 * 库存调整单查询
 */
public class InventoryAdjustmentFindRequest implements ApiCloudRequest<AdjustmentFindV2DTOModel, List<AdjustmentOrderVOModel>> {

    private AdjustmentFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustment.find";
    }

    @Override
    public AdjustmentFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AdjustmentFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AdjustmentOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AdjustmentOrderVOModel>>>() {};
    }

}

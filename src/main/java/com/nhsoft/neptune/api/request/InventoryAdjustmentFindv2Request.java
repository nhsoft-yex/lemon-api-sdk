package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AdjustmentFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import com.nhsoft.neptune.api.domain.AdjustmentOrderVOModel;

import java.util.*;

/**
 * findAdjustmentV2请求类
 * 库存调整单查询
 */
public class InventoryAdjustmentFindv2Request implements ApiCloudRequest<AdjustmentFindV3DTOModel, List<AdjustmentOrderVOModel>> {

    private AdjustmentFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.adjustment.find/v2";
    }

    @Override
    public AdjustmentFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AdjustmentFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AdjustmentOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AdjustmentOrderVOModel>>>() {};
    }

}

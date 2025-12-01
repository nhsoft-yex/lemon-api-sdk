package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckOrderSnapshotV2DTOModel;

import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import java.util.*;

/**
 * checkSnapshot请求类
 * 库存盘点单快照
 */
public class InventoryCheckSnapshotRequest implements ApiCloudRequest<CheckOrderSnapshotV2DTOModel, CheckOrderV3DTOModel> {

    private CheckOrderSnapshotV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.check.snapshot";
    }

    @Override
    public CheckOrderSnapshotV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckOrderSnapshotV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>>() {};
    }

}

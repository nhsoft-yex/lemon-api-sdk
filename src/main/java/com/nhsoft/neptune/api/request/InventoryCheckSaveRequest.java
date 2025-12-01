package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import java.util.*;

/**
 * checkSave请求类
 * 库存盘点单新增
 */
public class InventoryCheckSaveRequest implements ApiCloudRequest<CheckOrderSaveV2DTOModel, CheckOrderV3DTOModel> {

    private CheckOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.check.save";
    }

    @Override
    public CheckOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>>() {};
    }

}

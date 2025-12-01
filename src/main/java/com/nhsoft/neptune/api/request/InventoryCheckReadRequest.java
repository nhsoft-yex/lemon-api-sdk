package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckOrderReadV2DTOModel;

import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import java.util.*;

/**
 * checkRead请求类
 * 库存盘点单读取
 */
public class InventoryCheckReadRequest implements ApiCloudRequest<CheckOrderReadV2DTOModel, CheckOrderV3DTOModel> {

    private CheckOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.check.read";
    }

    @Override
    public CheckOrderReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckOrderReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>>() {};
    }

}

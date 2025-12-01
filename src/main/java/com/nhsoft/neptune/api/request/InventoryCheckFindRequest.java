package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckOrderFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import java.util.*;

/**
 * checkFind请求类
 * 库存盘点单查询
 */
public class InventoryCheckFindRequest implements ApiCloudRequest<CheckOrderFindV2DTOModel, List<CheckOrderV3DTOModel>> {

    private CheckOrderFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.check.find";
    }

    @Override
    public CheckOrderFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckOrderFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CheckOrderV3DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CheckOrderV3DTOModel>>>() {};
    }

}

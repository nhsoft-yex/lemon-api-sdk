package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckOrderFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import java.util.*;

/**
 * checkFindV2请求类
 * 库存盘点单查询
 */
public class InventoryCheckFindv2Request implements ApiCloudRequest<CheckOrderFindV3DTOModel, List<CheckOrderV3DTOModel>> {

    private CheckOrderFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.check.find/v2";
    }

    @Override
    public CheckOrderFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckOrderFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CheckOrderV3DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CheckOrderV3DTOModel>>>() {};
    }

}

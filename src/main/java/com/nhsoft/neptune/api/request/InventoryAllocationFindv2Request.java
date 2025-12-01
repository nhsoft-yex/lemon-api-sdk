package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AllocationOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.AllocationOrderV2DTOModel;

import java.util.*;

/**
 * allocationFindV2请求类
 * 库存转仓单查询
 */
public class InventoryAllocationFindv2Request implements ApiCloudRequest<AllocationFindV3DTOModel, List<AllocationOrderV2DTOModel>> {

    private AllocationFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.allocation.find/v2";
    }

    @Override
    public AllocationFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AllocationOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AllocationOrderV2DTOModel>>>() {};
    }

}

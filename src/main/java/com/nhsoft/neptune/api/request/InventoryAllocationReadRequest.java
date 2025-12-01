package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationOrderReadV2DTOModel;

import com.nhsoft.neptune.api.domain.AllocationOrderV2DTOModel;

import java.util.*;

/**
 * allocationRead请求类
 * 库存转仓单读取
 */
public class InventoryAllocationReadRequest implements ApiCloudRequest<AllocationOrderReadV2DTOModel, AllocationOrderV2DTOModel> {

    private AllocationOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.allocation.read";
    }

    @Override
    public AllocationOrderReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationOrderReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AllocationOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AllocationOrderV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.AllocationOrderV2DTOModel;

import java.util.*;

/**
 * allocationUpdate请求类
 * 库存转仓单修改
 */
public class InventoryAllocationUpdateRequest implements ApiCloudRequest<AllocationOrderUpdateV2DTOModel, AllocationOrderV2DTOModel> {

    private AllocationOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.allocation.update";
    }

    @Override
    public AllocationOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AllocationOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AllocationOrderV2DTOModel>>() {};
    }

}

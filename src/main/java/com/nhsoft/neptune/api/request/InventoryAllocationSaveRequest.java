package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.AllocationOrderV2DTOModel;

import java.util.*;

/**
 * allocationSave请求类
 * 库存转仓单保存
 */
public class InventoryAllocationSaveRequest implements ApiCloudRequest<AllocationOrderSaveV2DTOModel, AllocationOrderV2DTOModel> {

    private AllocationOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.allocation.save";
    }

    @Override
    public AllocationOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AllocationOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AllocationOrderV2DTOModel>>() {};
    }

}

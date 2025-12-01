package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AllocationFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AllocationOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.AllocationOrderV2DTOModel;

import java.util.*;

/**
 * allocationFind请求类
 * 库存转仓单查询
 */
public class InventoryAllocationFindRequest implements ApiCloudRequest<AllocationFindV2DTOModel, List<AllocationOrderV2DTOModel>> {

    private AllocationFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.allocation.find";
    }

    @Override
    public AllocationFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AllocationFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AllocationOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AllocationOrderV2DTOModel>>>() {};
    }

}

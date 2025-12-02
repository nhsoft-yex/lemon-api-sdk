package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InventoryV2DTOModel;

import com.nhsoft.neptune.api.domain.InventoryV2DTOModel;

import java.util.*;

/**
 * findInventory请求类
 * 库存查询
 */
public class InventoryInventoryFindRequest implements ApiCloudRequest<InventoryFindDTOModel, List<InventoryV2DTOModel>> {

    private InventoryFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.inventory.find";
    }

    @Override
    public InventoryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InventoryV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InventoryV2DTOModel>>>() {};
    }

}

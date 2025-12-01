package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InventoryVOModel;

import com.nhsoft.neptune.api.domain.InventoryVOModel;

import java.util.*;

/**
 * find_8请求类
 * 库存查询
 */
public class WmsInventoryFindRequest implements ApiCloudRequest<InventoryFindDTOModel, List<InventoryVOModel>> {

    private InventoryFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.inventory.find";
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
    public TypeReference<ApiCloudResponse<List<InventoryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InventoryVOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryDailyItemFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InventoryDailyItemV2DTOModel;

import com.nhsoft.neptune.api.domain.InventoryDailyItemV2DTOModel;

import java.util.*;

/**
 * findInventorySnapshot请求类
 * 库存快照查询
 */
public class InventoryInventorysanpFindRequest implements ApiCloudRequest<InventoryDailyItemFindDTOModel, List<InventoryDailyItemV2DTOModel>> {

    private InventoryDailyItemFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.inventorysanp.find";
    }

    @Override
    public InventoryDailyItemFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryDailyItemFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InventoryDailyItemV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InventoryDailyItemV2DTOModel>>>() {};
    }

}

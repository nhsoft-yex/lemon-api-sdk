package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryLatestFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InventoryLatestDTOModel;

import com.nhsoft.neptune.api.domain.InventoryLatestDTOModel;

import java.util.*;

/**
 * findInventoryLatest请求类
 * 库存查询最新批次及生产日期
 */
public class InventoryLatestFindRequest implements ApiCloudRequest<InventoryLatestFindDTOModel, List<InventoryLatestDTOModel>> {

    private InventoryLatestFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.latest.find";
    }

    @Override
    public InventoryLatestFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryLatestFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InventoryLatestDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InventoryLatestDTOModel>>>() {};
    }

}

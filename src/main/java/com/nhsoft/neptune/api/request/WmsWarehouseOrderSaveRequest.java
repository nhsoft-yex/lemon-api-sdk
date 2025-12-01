package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WarehouseOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.WarehouseOrderVOModel;

import java.util.*;

/**
 * save请求类
 * 入库单新增
 */
public class WmsWarehouseOrderSaveRequest implements ApiCloudRequest<WarehouseOrderSaveDTOModel, WarehouseOrderVOModel> {

    private WarehouseOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.warehouse.order.save";
    }

    @Override
    public WarehouseOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WarehouseOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WarehouseOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WarehouseOrderVOModel>>() {};
    }

}

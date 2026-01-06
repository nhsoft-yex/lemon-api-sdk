package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WarehouseOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.WarehouseOrderVOModel;

import java.util.*;

/**
 * read_12请求类
 * 入库单读取
 */
public class WmsWarehouseOrderReadRequest implements ApiCloudRequest<WarehouseOrderReadDTOModel, WarehouseOrderVOModel> {

    private WarehouseOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.warehouse.order.read";
    }

    @Override
    public WarehouseOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WarehouseOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WarehouseOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WarehouseOrderVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WarehouseOrderReadDTOModel;

import java.util.*;

/**
 * delete请求类
 * 入库单删除
 */
public class WmsWarehouseOrderDeleteRequest implements ApiCloudRequest<WarehouseOrderReadDTOModel, Void> {

    private WarehouseOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.warehouse.order.delete";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WarehouseOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WarehouseOrderVOModel;

import com.nhsoft.neptune.api.domain.WarehouseOrderVOModel;

import java.util.*;

/**
 * read请求类
 * 入库单查询
 */
public class WmsWarehouseOrderFindRequest implements ApiCloudRequest<WarehouseOrderFindDTOModel, List<WarehouseOrderVOModel>> {

    private WarehouseOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.warehouse.order.find";
    }

    @Override
    public WarehouseOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WarehouseOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WarehouseOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WarehouseOrderVOModel>>>() {};
    }

}

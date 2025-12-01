package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WmsReturnOrderFindByWarehouseOrderDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsReturnOrderWarehouseOrderDTOModel;

import com.nhsoft.neptune.api.domain.WmsReturnOrderWarehouseOrderDTOModel;

import java.util.*;

/**
 * findReturnByWarehouseOrderFids请求类
 * 根据入库单查询销退订单
 */
public class WmsReturnOrderBywarehouseorderfidRequest implements ApiCloudRequest<WmsReturnOrderFindByWarehouseOrderDTOModel, List<WmsReturnOrderWarehouseOrderDTOModel>> {

    private WmsReturnOrderFindByWarehouseOrderDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.return.order.bywarehouseorderfid";
    }

    @Override
    public WmsReturnOrderFindByWarehouseOrderDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WmsReturnOrderFindByWarehouseOrderDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WmsReturnOrderWarehouseOrderDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsReturnOrderWarehouseOrderDTOModel>>>() {};
    }

}

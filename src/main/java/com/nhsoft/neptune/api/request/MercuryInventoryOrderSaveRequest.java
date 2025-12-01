package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryOrderSaveDTOModel;

import java.util.*;

/**
 * saveInventoryOrder请求类
 * 新增商城库存调整单
 */
public class MercuryInventoryOrderSaveRequest implements ApiCloudRequest<InventoryOrderSaveDTOModel, Object> {

    private InventoryOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.mercury.inventory.order.save";
    }

    @Override
    public InventoryOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

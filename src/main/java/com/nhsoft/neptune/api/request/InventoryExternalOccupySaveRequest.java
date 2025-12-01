package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryExternalOccupySaveDTOModel;

import java.util.*;

/**
 * saveExternalInventoryOccupy请求类
 * 新增外部应用占用当前库存
 */
public class InventoryExternalOccupySaveRequest implements ApiCloudRequest<InventoryExternalOccupySaveDTOModel, Void> {

    private InventoryExternalOccupySaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.external.occupy.save";
    }

    @Override
    public InventoryExternalOccupySaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryExternalOccupySaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

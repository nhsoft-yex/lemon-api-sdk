package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryExternalOccupyDeleteDTOModel;

import java.util.*;

/**
 * deleteExternalOccupy请求类
 * 删除外部应用占用当前库存
 */
public class InventoryExternalOccupyDeleteRequest implements ApiCloudRequest<InventoryExternalOccupyDeleteDTOModel, Void> {

    private InventoryExternalOccupyDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.external.occupy.delete";
    }

    @Override
    public InventoryExternalOccupyDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryExternalOccupyDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

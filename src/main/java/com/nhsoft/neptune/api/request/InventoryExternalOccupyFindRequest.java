package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InventoryExternalOccupyFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InventoryExternalOccupyVOModel;

import com.nhsoft.neptune.api.domain.InventoryExternalOccupyVOModel;

import java.util.*;

/**
 * findExternalOccupy请求类
 * 查询外部应用占用当前库存
 */
public class InventoryExternalOccupyFindRequest implements ApiCloudRequest<InventoryExternalOccupyFindDTOModel, List<InventoryExternalOccupyVOModel>> {

    private InventoryExternalOccupyFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.external.occupy.find";
    }

    @Override
    public InventoryExternalOccupyFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InventoryExternalOccupyFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InventoryExternalOccupyVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InventoryExternalOccupyVOModel>>>() {};
    }

}

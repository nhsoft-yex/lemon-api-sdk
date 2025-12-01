package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreItemSupplierBatchSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StoreItemSupplierV2DTOModel;

import com.nhsoft.neptune.api.domain.StoreItemSupplierV2DTOModel;

import java.util.*;

/**
 * batchSaveStoreItem请求类
 * 供货关系批量保存
 */
public class StoreItemBatchsaveRequest implements ApiCloudRequest<StoreItemSupplierBatchSaveDTOModel, List<StoreItemSupplierV2DTOModel>> {

    private StoreItemSupplierBatchSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.store.item.batchsave";
    }

    @Override
    public StoreItemSupplierBatchSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreItemSupplierBatchSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StoreItemSupplierV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StoreItemSupplierV2DTOModel>>>() {};
    }

}

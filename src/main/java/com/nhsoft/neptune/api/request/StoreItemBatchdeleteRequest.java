package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreItemSupplierBatchDeleteDTOModel;

import java.util.*;

/**
 * batchDeleteStoreItem请求类
 * 供货关系批量删除
 */
public class StoreItemBatchdeleteRequest implements ApiCloudRequest<StoreItemSupplierBatchDeleteDTOModel, Void> {

    private StoreItemSupplierBatchDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.store.item.batchdelete";
    }

    @Override
    public StoreItemSupplierBatchDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreItemSupplierBatchDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

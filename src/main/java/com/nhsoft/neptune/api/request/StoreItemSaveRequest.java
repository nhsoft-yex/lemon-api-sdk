package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreItemSupplierSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.StoreItemSupplierV2DTOModel;

import java.util.*;

/**
 * saveStoreItem请求类
 * 供货关系保存
 */
public class StoreItemSaveRequest implements ApiCloudRequest<StoreItemSupplierSaveV2DTOModel, StoreItemSupplierV2DTOModel> {

    private StoreItemSupplierSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.store.item.save";
    }

    @Override
    public StoreItemSupplierSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreItemSupplierSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<StoreItemSupplierV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<StoreItemSupplierV2DTOModel>>() {};
    }

}

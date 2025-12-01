package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreItemSupplierDeleteV2DTOModel;

import java.util.*;

/**
 * deleteStoreItem请求类
 * 供货关系删除
 */
public class StoreItemDeleteRequest implements ApiCloudRequest<StoreItemSupplierDeleteV2DTOModel, Void> {

    private StoreItemSupplierDeleteV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.store.item.delete";
    }

    @Override
    public StoreItemSupplierDeleteV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreItemSupplierDeleteV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

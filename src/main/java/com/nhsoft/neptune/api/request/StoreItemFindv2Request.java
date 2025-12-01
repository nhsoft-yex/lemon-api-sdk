package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.StoreItemFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.StoreItemSupplierV2DTOModel;

import com.nhsoft.neptune.api.domain.StoreItemSupplierV2DTOModel;

import java.util.*;

/**
 * findStoreItemV2请求类
 * 获取供货关系
 */
public class StoreItemFindv2Request implements ApiCloudRequest<StoreItemFindV2DTOModel, List<StoreItemSupplierV2DTOModel>> {

    private StoreItemFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.store.item.find/v2";
    }

    @Override
    public StoreItemFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(StoreItemFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<StoreItemSupplierV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<StoreItemSupplierV2DTOModel>>>() {};
    }

}

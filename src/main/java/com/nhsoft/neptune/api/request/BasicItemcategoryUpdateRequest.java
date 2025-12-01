package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemCategorySaveV2DTOModel;

import com.nhsoft.neptune.api.domain.ItemCategorySaveV2DTOModel;

import java.util.*;

/**
 * updateItemCategory请求类
 * 商品类别修改
 */
public class BasicItemcategoryUpdateRequest implements ApiCloudRequest<ItemCategorySaveV2DTOModel, ItemCategorySaveV2DTOModel> {

    private ItemCategorySaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemcategory.update";
    }

    @Override
    public ItemCategorySaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemCategorySaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ItemCategorySaveV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ItemCategorySaveV2DTOModel>>() {};
    }

}

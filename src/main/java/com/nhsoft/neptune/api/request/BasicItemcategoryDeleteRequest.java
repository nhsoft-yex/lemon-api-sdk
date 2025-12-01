package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemCategoryDeleteDTOModel;

import java.util.*;

/**
 * deleteItemCategory请求类
 * 商品类别删除
 */
public class BasicItemcategoryDeleteRequest implements ApiCloudRequest<ItemCategoryDeleteDTOModel, Void> {

    private ItemCategoryDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemcategory.delete";
    }

    @Override
    public ItemCategoryDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemCategoryDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

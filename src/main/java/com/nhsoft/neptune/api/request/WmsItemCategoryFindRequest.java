package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemCategoryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ItemCategoryVOModel;

import com.nhsoft.neptune.api.domain.ItemCategoryVOModel;

import java.util.*;

/**
 * update_3请求类
 * wms商品类别查询
 */
public class WmsItemCategoryFindRequest implements ApiCloudRequest<ItemCategoryFindDTOModel, List<ItemCategoryVOModel>> {

    private ItemCategoryFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.item.category.find";
    }

    @Override
    public ItemCategoryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemCategoryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ItemCategoryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ItemCategoryVOModel>>>() {};
    }

}

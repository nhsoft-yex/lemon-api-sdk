package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemCategoryFindByItemsDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ItemWithCategoryVOModel;

import com.nhsoft.neptune.api.domain.ItemWithCategoryVOModel;

import java.util.*;

/**
 * update_2请求类
 * wms根据商品编码查询商品类别
 */
public class WmsItemCategoryFindbyitemsRequest implements ApiCloudRequest<ItemCategoryFindByItemsDTOModel, List<ItemWithCategoryVOModel>> {

    private ItemCategoryFindByItemsDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.item.category.findbyitems";
    }

    @Override
    public ItemCategoryFindByItemsDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemCategoryFindByItemsDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ItemWithCategoryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ItemWithCategoryVOModel>>>() {};
    }

}

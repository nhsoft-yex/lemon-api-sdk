package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.ItemCategoryFindV2DTOModel;

import com.nhsoft.neptune.api.domain.ItemCategoryFindV2DTOModel;

import java.util.*;

/**
 * itemCategoryFind请求类
 * 商品类别查询
 */
public class BasicItemcategoryFindRequest implements ApiCloudRequest<Void, List<ItemCategoryFindV2DTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemcategory.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ItemCategoryFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ItemCategoryFindV2DTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemFindV2DTOModel;

import com.nhsoft.neptune.api.domain.PosItemFindV2DTOModel;

import java.util.*;

/**
 * itemFind请求类
 * 商品档案查询
 */
public class BasicItemFindRequest implements ApiCloudRequest<ItemFindDTOModel, List<PosItemFindV2DTOModel>> {

    private ItemFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.find";
    }

    @Override
    public ItemFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemFindV2DTOModel>>>() {};
    }

}

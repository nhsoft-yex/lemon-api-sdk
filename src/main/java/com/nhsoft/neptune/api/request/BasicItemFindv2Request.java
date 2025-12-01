package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosItemFindV2DTOModel;

import com.nhsoft.neptune.api.domain.PosItemFindV2DTOModel;

import java.util.*;

/**
 * findItemV2请求类
 * 商品档案查询
 */
public class BasicItemFindv2Request implements ApiCloudRequest<ItemFindV2DTOModel, List<PosItemFindV2DTOModel>> {

    private ItemFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.find/v2";
    }

    @Override
    public ItemFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosItemFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosItemFindV2DTOModel>>>() {};
    }

}

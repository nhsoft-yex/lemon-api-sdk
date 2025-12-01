package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WmsItemVOModel;

import com.nhsoft.neptune.api.domain.WmsItemVOModel;

import java.util.*;

/**
 * find_7请求类
 * wms商品档案查询
 */
public class WmsItemFindRequest implements ApiCloudRequest<ItemFindDTOModel, List<WmsItemVOModel>> {

    private ItemFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.item.find";
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
    public TypeReference<ApiCloudResponse<List<WmsItemVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WmsItemVOModel>>>() {};
    }

}

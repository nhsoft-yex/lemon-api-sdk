package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemSpecLocationFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ItemSpecLocationVOModel;

import com.nhsoft.neptune.api.domain.ItemSpecLocationVOModel;

import java.util.*;

/**
 * findItemSpecLocation_1请求类
 * 查询库位设置
 */
public class BaseItemSpecLocationFindRequest implements ApiCloudRequest<ItemSpecLocationFindDTOModel, List<ItemSpecLocationVOModel>> {

    private ItemSpecLocationFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.spec.location.find";
    }

    @Override
    public ItemSpecLocationFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemSpecLocationFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ItemSpecLocationVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ItemSpecLocationVOModel>>>() {};
    }

}

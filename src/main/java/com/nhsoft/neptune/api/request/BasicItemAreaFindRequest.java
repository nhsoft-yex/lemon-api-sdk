package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemAreaFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ItemAreaDTOModel;

import com.nhsoft.neptune.api.domain.ItemAreaDTOModel;

import java.util.*;

/**
 * findItemArea请求类
 * 商品档案体积查询
 */
public class BasicItemAreaFindRequest implements ApiCloudRequest<ItemAreaFindDTOModel, List<ItemAreaDTOModel>> {

    private ItemAreaFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.area.find";
    }

    @Override
    public ItemAreaFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemAreaFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ItemAreaDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ItemAreaDTOModel>>>() {};
    }

}

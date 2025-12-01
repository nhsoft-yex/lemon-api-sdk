package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemAreaSaveDTOModel;

import com.nhsoft.neptune.api.domain.ItemAreaDTOModel;

import java.util.*;

/**
 * saveItemArea请求类
 * 商品档案体积新增或更新
 */
public class BasicItemAreaSaveRequest implements ApiCloudRequest<ItemAreaSaveDTOModel, ItemAreaDTOModel> {

    private ItemAreaSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.area.save";
    }

    @Override
    public ItemAreaSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemAreaSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ItemAreaDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ItemAreaDTOModel>>() {};
    }

}

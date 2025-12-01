package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemSaveDTOModel;

import java.util.*;

/**
 * save_2请求类
 * wms商品档案新增
 */
public class WmsItemSaveRequest implements ApiCloudRequest<ItemSaveDTOModel, Void> {

    private ItemSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.item.save";
    }

    @Override
    public ItemSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemSpecLocationSaveDTOModel;

import com.nhsoft.neptune.api.domain.ItemSpecLocationSimpleVOModel;

import java.util.*;

/**
 * findItemSpecLocation请求类
 * 新增库位设置
 */
public class BaseItemSpecLocationSaveRequest implements ApiCloudRequest<ItemSpecLocationSaveDTOModel, ItemSpecLocationSimpleVOModel> {

    private ItemSpecLocationSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.base.item.spec.location.save";
    }

    @Override
    public ItemSpecLocationSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemSpecLocationSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ItemSpecLocationSimpleVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ItemSpecLocationSimpleVOModel>>() {};
    }

}

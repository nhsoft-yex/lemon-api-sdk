package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemTraceSaveDTOModel;

import com.nhsoft.neptune.api.domain.ItemTraceDTOModel;

import java.util.*;

/**
 * saveItemTraceLog请求类
 * 溯源数据新增
 */
public class BasicItemtraceSaveRequest implements ApiCloudRequest<ItemTraceSaveDTOModel, ItemTraceDTOModel> {

    private ItemTraceSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.itemtrace.save";
    }

    @Override
    public ItemTraceSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemTraceSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ItemTraceDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ItemTraceDTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemUpdateToStandardTypeDTOModel;

import java.util.*;

/**
 * updateToStandard请求类
 * 成分商品转成标准商品
 */
public class BasicItemUpdateTypeStandardRequest implements ApiCloudRequest<ItemUpdateToStandardTypeDTOModel, Void> {

    private ItemUpdateToStandardTypeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.update.type.standard";
    }

    @Override
    public ItemUpdateToStandardTypeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemUpdateToStandardTypeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

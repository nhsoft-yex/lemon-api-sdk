package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemUpdateToElementTypeDTOModel;

import java.util.*;

/**
 * updateToElementType请求类
 * 标准商品转成分商品
 */
public class BasicItemUpdateTypeElementRequest implements ApiCloudRequest<ItemUpdateToElementTypeDTOModel, Void> {

    private ItemUpdateToElementTypeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.update.type.element";
    }

    @Override
    public ItemUpdateToElementTypeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemUpdateToElementTypeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

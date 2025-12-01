package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemNumsDTOModel;

import java.util.*;

/**
 * readKitParentItems请求类
 * 商品关联制单组合查询
 */
public class BasicItemKitParentFindRequest implements ApiCloudRequest<ItemNumsDTOModel, Void> {

    private ItemNumsDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.kit.parent.find";
    }

    @Override
    public ItemNumsDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemNumsDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

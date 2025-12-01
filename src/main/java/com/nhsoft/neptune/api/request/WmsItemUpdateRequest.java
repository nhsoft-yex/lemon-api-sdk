package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemUpdateDTOModel;

import java.util.*;

/**
 * update_1请求类
 * wms商品档案修改
 */
public class WmsItemUpdateRequest implements ApiCloudRequest<ItemUpdateDTOModel, Void> {

    private ItemUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.item.update";
    }

    @Override
    public ItemUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

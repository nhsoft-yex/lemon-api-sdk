package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemReadDTOModel;

import com.nhsoft.neptune.api.domain.PosItemFindV2DTOModel;

import java.util.*;

/**
 * itemRead请求类
 * 商品档案读取
 */
public class BasicItemReadRequest implements ApiCloudRequest<ItemReadDTOModel, PosItemFindV2DTOModel> {

    private ItemReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.read";
    }

    @Override
    public ItemReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosItemFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosItemFindV2DTOModel>>() {};
    }

}

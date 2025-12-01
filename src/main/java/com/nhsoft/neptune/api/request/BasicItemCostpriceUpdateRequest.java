package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ItemCostPriceUpdateDTOModel;

import java.util.*;

/**
 * updateItemCostPrice请求类
 * 商品档案成本价修改
 */
public class BasicItemCostpriceUpdateRequest implements ApiCloudRequest<ItemCostPriceUpdateDTOModel, Void> {

    private ItemCostPriceUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.item.costprice.update";
    }

    @Override
    public ItemCostPriceUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ItemCostPriceUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

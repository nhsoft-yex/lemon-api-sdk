package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasketBorrowOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.BasketBorrowOrderVOModel;

import java.util.*;

/**
 * updateBasketBorrowOrder请求类
 * 修改筐借还单
 */
public class WmsBasketBorrowOrderUpdateRequest implements ApiCloudRequest<BasketBorrowOrderUpdateDTOModel, BasketBorrowOrderVOModel> {

    private BasketBorrowOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.basket.borrow.order.update";
    }

    @Override
    public BasketBorrowOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasketBorrowOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>>() {};
    }

}

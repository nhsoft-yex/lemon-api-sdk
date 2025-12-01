package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasketBorrowOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.BasketBorrowOrderVOModel;

import java.util.*;

/**
 * readBasketBorrowOrder_2请求类
 * 读取筐借还单
 */
public class WmsBasketBorrowOrderReadRequest implements ApiCloudRequest<BasketBorrowOrderReadDTOModel, BasketBorrowOrderVOModel> {

    private BasketBorrowOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.basket.borrow.order.read";
    }

    @Override
    public BasketBorrowOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasketBorrowOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>>() {};
    }

}

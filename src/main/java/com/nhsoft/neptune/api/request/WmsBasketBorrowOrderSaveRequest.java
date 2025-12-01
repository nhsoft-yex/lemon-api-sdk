package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasketBorrowOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.BasketBorrowOrderVOModel;

import java.util.*;

/**
 * saveBasketBorrowOrder请求类
 * 新增筐借还单
 */
public class WmsBasketBorrowOrderSaveRequest implements ApiCloudRequest<BasketBorrowOrderSaveDTOModel, BasketBorrowOrderVOModel> {

    private BasketBorrowOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.basket.borrow.order.save";
    }

    @Override
    public BasketBorrowOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasketBorrowOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>>() {};
    }

}

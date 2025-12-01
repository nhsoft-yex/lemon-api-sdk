package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasketBorrowOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BasketBorrowOrderVOModel;

import com.nhsoft.neptune.api.domain.BasketBorrowOrderVOModel;

import java.util.*;

/**
 * findBasketBorrowOrder请求类
 * 查询筐借还单
 */
public class WmsBasketBorrowOrderFindRequest implements ApiCloudRequest<BasketBorrowOrderFindDTOModel, List<BasketBorrowOrderVOModel>> {

    private BasketBorrowOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.basket.borrow.order.find";
    }

    @Override
    public BasketBorrowOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasketBorrowOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BasketBorrowOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BasketBorrowOrderVOModel>>>() {};
    }

}

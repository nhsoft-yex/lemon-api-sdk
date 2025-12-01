package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BasketBorrowOrderAuditDTOModel;

import com.nhsoft.neptune.api.domain.BasketBorrowOrderVOModel;

import java.util.*;

/**
 * readBasketBorrowOrder_1请求类
 * 审核筐借还单
 */
public class WmsBasketBorrowOrderAuditRequest implements ApiCloudRequest<BasketBorrowOrderAuditDTOModel, BasketBorrowOrderVOModel> {

    private BasketBorrowOrderAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.basket.borrow.order.audit";
    }

    @Override
    public BasketBorrowOrderAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BasketBorrowOrderAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BasketBorrowOrderVOModel>>() {};
    }

}

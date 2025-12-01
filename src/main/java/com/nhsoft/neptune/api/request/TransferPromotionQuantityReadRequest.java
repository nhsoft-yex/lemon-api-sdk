package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPromotionReadDTOModel;

import com.nhsoft.neptune.api.domain.TransferPromotionQuantityVOModel;

import java.util.*;

/**
 * readQuantity请求类
 * 配送超量特价读取
 */
public class TransferPromotionQuantityReadRequest implements ApiCloudRequest<TransferPromotionReadDTOModel, TransferPromotionQuantityVOModel> {

    private TransferPromotionReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.transfer.promotion.quantity.read";
    }

    @Override
    public TransferPromotionReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPromotionReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TransferPromotionQuantityVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TransferPromotionQuantityVOModel>>() {};
    }

}

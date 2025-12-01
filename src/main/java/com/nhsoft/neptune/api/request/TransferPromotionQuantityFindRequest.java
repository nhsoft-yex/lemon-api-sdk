package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPromotionQuantityFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TransferPromotionQuantityVOModel;

import com.nhsoft.neptune.api.domain.TransferPromotionQuantityVOModel;

import java.util.*;

/**
 * findQuantity请求类
 * 配送超量特价查询
 */
public class TransferPromotionQuantityFindRequest implements ApiCloudRequest<TransferPromotionQuantityFindDTOModel, List<TransferPromotionQuantityVOModel>> {

    private TransferPromotionQuantityFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.transfer.promotion.quantity.find";
    }

    @Override
    public TransferPromotionQuantityFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPromotionQuantityFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TransferPromotionQuantityVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TransferPromotionQuantityVOModel>>>() {};
    }

}

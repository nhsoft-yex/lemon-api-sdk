package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionVOModel;

import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionVOModel;

import java.util.*;

/**
 * purchaseGiftPromotionFind请求类
 * 采购赠品促销查询
 */
public class PurchaseGiftpromotionFindRequest implements ApiCloudRequest<PurchaseGiftPromotionFindDTOModel, List<PurchaseGiftPromotionVOModel>> {

    private PurchaseGiftPromotionFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.giftpromotion.find";
    }

    @Override
    public PurchaseGiftPromotionFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseGiftPromotionFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseGiftPromotionVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseGiftPromotionVOModel>>>() {};
    }

}

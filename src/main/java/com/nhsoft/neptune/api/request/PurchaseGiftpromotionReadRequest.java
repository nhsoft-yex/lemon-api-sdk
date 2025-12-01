package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionReadDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionVOModel;

import java.util.*;

/**
 * purchaseGiftPromotionRead请求类
 * 采购赠品促销读取
 */
public class PurchaseGiftpromotionReadRequest implements ApiCloudRequest<PurchaseGiftPromotionReadDTOModel, PurchaseGiftPromotionVOModel> {

    private PurchaseGiftPromotionReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.giftpromotion.read";
    }

    @Override
    public PurchaseGiftPromotionReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseGiftPromotionReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseGiftPromotionVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseGiftPromotionVOModel>>() {};
    }

}

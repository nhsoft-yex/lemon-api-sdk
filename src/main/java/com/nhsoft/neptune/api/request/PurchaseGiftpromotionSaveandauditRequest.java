package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionVOModel;

import com.nhsoft.neptune.api.domain.PurchaseGiftPromotionVOModel;

import java.util.*;

/**
 * purchaseGiftPromotionSaveAndAudit请求类
 * 采购赠品促销保存并审核
 */
public class PurchaseGiftpromotionSaveandauditRequest implements ApiCloudRequest<PurchaseGiftPromotionSaveDTOModel, List<PurchaseGiftPromotionVOModel>> {

    private PurchaseGiftPromotionSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.giftpromotion.saveandaudit";
    }

    @Override
    public PurchaseGiftPromotionSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseGiftPromotionSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseGiftPromotionVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseGiftPromotionVOModel>>>() {};
    }

}

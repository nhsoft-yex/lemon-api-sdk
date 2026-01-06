package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentSaveDTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentVOModel;

import java.util.*;

/**
 * saveAndAudit_11请求类
 * 商品调价新增并审核
 */
public class BasicPriceadjSaveandauditRequest implements ApiCloudRequest<PriceAdjustmentSaveDTOModel, PriceAdjustmentVOModel> {

    private PriceAdjustmentSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.saveandaudit";
    }

    @Override
    public PriceAdjustmentSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>>() {};
    }

}

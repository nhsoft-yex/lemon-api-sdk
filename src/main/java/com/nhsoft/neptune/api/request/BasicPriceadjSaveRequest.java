package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentSaveDTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentVOModel;

import java.util.*;

/**
 * save_21请求类
 * 商品调价新增
 */
public class BasicPriceadjSaveRequest implements ApiCloudRequest<PriceAdjustmentSaveDTOModel, PriceAdjustmentVOModel> {

    private PriceAdjustmentSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.save";
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

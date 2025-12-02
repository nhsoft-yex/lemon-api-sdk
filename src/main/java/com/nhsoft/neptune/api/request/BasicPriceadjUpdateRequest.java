package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentVOModel;

import java.util.*;

/**
 * update_20请求类
 * 商品调价修改
 */
public class BasicPriceadjUpdateRequest implements ApiCloudRequest<PriceAdjustmentUpdateDTOModel, PriceAdjustmentVOModel> {

    private PriceAdjustmentUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.update";
    }

    @Override
    public PriceAdjustmentUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>>() {};
    }

}

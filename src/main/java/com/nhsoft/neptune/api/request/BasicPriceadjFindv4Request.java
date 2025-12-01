package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PriceAdjustmentVOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentVOModel;

import java.util.*;

/**
 * posOrderSaveV3_1请求类
 * 商品调价查询
 */
public class BasicPriceadjFindv4Request implements ApiCloudRequest<PriceAdjustmentFindDTOModel, List<PriceAdjustmentVOModel>> {

    private PriceAdjustmentFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.find/v4";
    }

    @Override
    public PriceAdjustmentFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PriceAdjustmentVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PriceAdjustmentVOModel>>>() {};
    }

}

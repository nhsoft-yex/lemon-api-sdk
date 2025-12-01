package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PriceadjV2DTOModel;

import com.nhsoft.neptune.api.domain.PriceadjV2DTOModel;

import java.util.*;

/**
 * findpriceAdjV3请求类
 * 商品调价查询
 */
public class BasicPriceadjFindv3Request implements ApiCloudRequest<PriceAdjustmentFindV3DTOModel, List<PriceadjV2DTOModel>> {

    private PriceAdjustmentFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.find/v3";
    }

    @Override
    public PriceAdjustmentFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PriceadjV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PriceadjV2DTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PriceadjV2DTOModel;

import com.nhsoft.neptune.api.domain.PriceadjV2DTOModel;

import java.util.*;

/**
 * findPriceAdjV2请求类
 * 商品调价查询
 */
public class BasicPriceadjFindv2Request implements ApiCloudRequest<PriceAdjustmentFindV2DTOModel, List<PriceadjV2DTOModel>> {

    private PriceAdjustmentFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.find/v2";
    }

    @Override
    public PriceAdjustmentFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PriceadjV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PriceadjV2DTOModel>>>() {};
    }

}

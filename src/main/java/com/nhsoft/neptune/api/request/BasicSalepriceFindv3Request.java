package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SalePriceFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SalePriceV2DTOModel;

import com.nhsoft.neptune.api.domain.SalePriceV2DTOModel;

import java.util.*;

/**
 * salePriceFindV3请求类
 * 门店分级商品价格查询
 */
public class BasicSalepriceFindv3Request implements ApiCloudRequest<SalePriceFindV3DTOModel, List<SalePriceV2DTOModel>> {

    private SalePriceFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.saleprice.find/v3";
    }

    @Override
    public SalePriceFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SalePriceFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SalePriceV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SalePriceV2DTOModel>>>() {};
    }

}

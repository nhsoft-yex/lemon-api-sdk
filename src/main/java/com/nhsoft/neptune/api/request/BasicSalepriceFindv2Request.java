package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SalePriceFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SalePriceV2DTOModel;

import com.nhsoft.neptune.api.domain.SalePriceV2DTOModel;

import java.util.*;

/**
 * salePriceFind_2请求类
 * 门店分级商品价格查询
 */
public class BasicSalepriceFindv2Request implements ApiCloudRequest<SalePriceFindV2DTOModel, List<SalePriceV2DTOModel>> {

    private SalePriceFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.saleprice.find/v2";
    }

    @Override
    public SalePriceFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SalePriceFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SalePriceV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SalePriceV2DTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SalePriceFindV1DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SalePriceV2DTOModel;

import com.nhsoft.neptune.api.domain.SalePriceV2DTOModel;

import java.util.*;

/**
 * salepriceFind请求类
 * 门店分级商品价格查询
 */
public class BasicSalepriceFindRequest implements ApiCloudRequest<SalePriceFindV1DTOModel, List<SalePriceV2DTOModel>> {

    private SalePriceFindV1DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.saleprice.find";
    }

    @Override
    public SalePriceFindV1DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SalePriceFindV1DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SalePriceV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SalePriceV2DTOModel>>>() {};
    }

}

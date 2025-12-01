package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SalePriceFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SalePriceVOModel;

import com.nhsoft.neptune.api.domain.SalePriceVOModel;

import java.util.*;

/**
 * salePriceFind_1请求类
 * 门店分级商品价格查询
 */
public class BasicSalepriceFindv4Request implements ApiCloudRequest<SalePriceFindDTOModel, List<SalePriceVOModel>> {

    private SalePriceFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.saleprice.find/v4";
    }

    @Override
    public SalePriceFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SalePriceFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SalePriceVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SalePriceVOModel>>>() {};
    }

}

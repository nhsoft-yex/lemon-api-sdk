package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceTagRequestFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PricetagRequestVOModel;

import com.nhsoft.neptune.api.domain.PricetagRequestVOModel;

import java.util.*;

/**
 * find_23请求类
 * 价签申请单查询
 */
public class BasicPricetagRequestFindRequest implements ApiCloudRequest<PriceTagRequestFindDTOModel, List<PricetagRequestVOModel>> {

    private PriceTagRequestFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.pricetag.request.find";
    }

    @Override
    public PriceTagRequestFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceTagRequestFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PricetagRequestVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PricetagRequestVOModel>>>() {};
    }

}

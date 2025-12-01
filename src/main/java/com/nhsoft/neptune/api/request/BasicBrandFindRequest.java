package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.BrandParamV2DTOModel;

import com.nhsoft.neptune.api.domain.BrandParamV2DTOModel;

import java.util.*;

/**
 * brandFind请求类
 * 商品品牌查询
 */
public class BasicBrandFindRequest implements ApiCloudRequest<Void, List<BrandParamV2DTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.brand.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BrandParamV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BrandParamV2DTOModel>>>() {};
    }

}

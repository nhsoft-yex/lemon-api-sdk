package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BrandParamSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.BrandParamSaveV2DTOModel;

import java.util.*;

/**
 * brandUpdate请求类
 * 商品品牌修改
 */
public class BasicBrandUpdateRequest implements ApiCloudRequest<BrandParamSaveV2DTOModel, BrandParamSaveV2DTOModel> {

    private BrandParamSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.brand.update";
    }

    @Override
    public BrandParamSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BrandParamSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BrandParamSaveV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BrandParamSaveV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BrandParamDeleteDTOModel;

import java.util.*;

/**
 * brandDelete请求类
 * 商品品牌删除
 */
public class BasicBrandDeleteRequest implements ApiCloudRequest<BrandParamDeleteDTOModel, Void> {

    private BrandParamDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.brand.delete";
    }

    @Override
    public BrandParamDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BrandParamDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

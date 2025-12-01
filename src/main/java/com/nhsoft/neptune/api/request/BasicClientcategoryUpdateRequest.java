package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientTypeSaveDTOModel;

import com.nhsoft.neptune.api.domain.PosClientTypeVOModel;

import java.util.*;

/**
 * clientCategoryUpdate请求类
 * 客户类别修改
 */
public class BasicClientcategoryUpdateRequest implements ApiCloudRequest<PosClientTypeSaveDTOModel, PosClientTypeVOModel> {

    private PosClientTypeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.clientcategory.update";
    }

    @Override
    public PosClientTypeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientTypeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosClientTypeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosClientTypeVOModel>>() {};
    }

}

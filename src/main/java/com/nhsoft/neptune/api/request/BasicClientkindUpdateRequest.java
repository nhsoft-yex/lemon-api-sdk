package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierCategoryUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierCategorySaveV2DTOModel;

import java.util.*;

/**
 * clientKindUpdate请求类
 * 供应商类型修改
 */
public class BasicClientkindUpdateRequest implements ApiCloudRequest<SupplierCategoryUpdateV2DTOModel, SupplierCategorySaveV2DTOModel> {

    private SupplierCategoryUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.clientkind.update";
    }

    @Override
    public SupplierCategoryUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierCategoryUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierCategorySaveV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierCategorySaveV2DTOModel>>() {};
    }

}

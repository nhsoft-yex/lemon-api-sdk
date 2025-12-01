package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierCategorySaveV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierCategorySaveV2DTOModel;

import java.util.*;

/**
 * clientKindSave请求类
 * 供应商类型保存
 */
public class BasicClientkindSaveRequest implements ApiCloudRequest<SupplierCategorySaveV2DTOModel, SupplierCategorySaveV2DTOModel> {

    private SupplierCategorySaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.clientkind.save";
    }

    @Override
    public SupplierCategorySaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierCategorySaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierCategorySaveV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierCategorySaveV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierV1VOModel;

import java.util.*;

/**
 * supplierSave请求类
 * 供应商新增
 */
public class BasicSupplierSaveRequest implements ApiCloudRequest<SupplierSaveV2DTOModel, SupplierV1VOModel> {

    private SupplierSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplier.save";
    }

    @Override
    public SupplierSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierV1VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierV1VOModel>>() {};
    }

}

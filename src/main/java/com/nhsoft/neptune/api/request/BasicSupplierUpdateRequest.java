package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierV1VOModel;

import java.util.*;

/**
 * supplierUpdate请求类
 * 供应商修改
 */
public class BasicSupplierUpdateRequest implements ApiCloudRequest<SupplierUpdateV2DTOModel, SupplierV1VOModel> {

    private SupplierUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplier.update";
    }

    @Override
    public SupplierUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierV1VOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierV1VOModel>>() {};
    }

}

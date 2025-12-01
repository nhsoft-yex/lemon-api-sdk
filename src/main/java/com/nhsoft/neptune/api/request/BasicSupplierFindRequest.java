package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierV1VOModel;

import com.nhsoft.neptune.api.domain.SupplierV1VOModel;

import java.util.*;

/**
 * supplierFind请求类
 * 供应商查询
 */
public class BasicSupplierFindRequest implements ApiCloudRequest<SupplierFindDTOModel, List<SupplierV1VOModel>> {

    private SupplierFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplier.find";
    }

    @Override
    public SupplierFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierV1VOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierV1VOModel>>>() {};
    }

}

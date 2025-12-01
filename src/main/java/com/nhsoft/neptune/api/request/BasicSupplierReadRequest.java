package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierReadV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierReadResponseV2DTOModel;

import java.util.*;

/**
 * readSupplier请求类
 * 供应商读取
 */
public class BasicSupplierReadRequest implements ApiCloudRequest<SupplierReadV2DTOModel, SupplierReadResponseV2DTOModel> {

    private SupplierReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplier.read";
    }

    @Override
    public SupplierReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierReadResponseV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierReadResponseV2DTOModel>>() {};
    }

}

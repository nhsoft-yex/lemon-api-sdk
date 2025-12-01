package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierDeleteDTOModel;

import java.util.*;

/**
 * supplierDelete请求类
 * 供应商删除
 */
public class BasicSupplierDeleteRequest implements ApiCloudRequest<SupplierDeleteDTOModel, Void> {

    private SupplierDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.supplier.delete";
    }

    @Override
    public SupplierDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierOtherInoutSaveDTOModel;

import com.nhsoft.neptune.api.domain.SupplierOtherInoutDTOModel;

import java.util.*;

/**
 * supplierOtherInoutSave请求类
 * 供应商费用单新增
 */
public class OtherinoutSupplierSaveRequest implements ApiCloudRequest<SupplierOtherInoutSaveDTOModel, SupplierOtherInoutDTOModel> {

    private SupplierOtherInoutSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.supplier.save";
    }

    @Override
    public SupplierOtherInoutSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierOtherInoutSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>>() {};
    }

}

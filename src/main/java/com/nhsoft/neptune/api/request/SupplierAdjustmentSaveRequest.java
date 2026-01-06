package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAdjustmentSaveDTOModel;

import com.nhsoft.neptune.api.domain.SupplierAdjustmentFullyVOModel;

import java.util.*;

/**
 * save_8请求类
 * 供应商调价单新增
 */
public class SupplierAdjustmentSaveRequest implements ApiCloudRequest<SupplierAdjustmentSaveDTOModel, SupplierAdjustmentFullyVOModel> {

    private SupplierAdjustmentSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.supplier.adjustment.save";
    }

    @Override
    public SupplierAdjustmentSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAdjustmentSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierAdjustmentFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierAdjustmentFullyVOModel>>() {};
    }

}

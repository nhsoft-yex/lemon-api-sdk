package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAdjustmentUpdateDTOModel;

import com.nhsoft.neptune.api.domain.SupplierAdjustmentFullyVOModel;

import java.util.*;

/**
 * update_8请求类
 * 供应商调价单更新
 */
public class SupplierAdjustmentUpdateRequest implements ApiCloudRequest<SupplierAdjustmentUpdateDTOModel, SupplierAdjustmentFullyVOModel> {

    private SupplierAdjustmentUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.supplier.adjustment.update";
    }

    @Override
    public SupplierAdjustmentUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAdjustmentUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierAdjustmentFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierAdjustmentFullyVOModel>>() {};
    }

}

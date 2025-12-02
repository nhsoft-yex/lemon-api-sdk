package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAdjustmentReadDTOModel;

import com.nhsoft.neptune.api.domain.SupplierAdjustmentFullyVOModel;

import java.util.*;

/**
 * audit_3请求类
 * 供应商调价单审核
 */
public class SupplierAdjustmentAuditRequest implements ApiCloudRequest<SupplierAdjustmentReadDTOModel, SupplierAdjustmentFullyVOModel> {

    private SupplierAdjustmentReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.supplier.adjustment.audit";
    }

    @Override
    public SupplierAdjustmentReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAdjustmentReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierAdjustmentFullyVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierAdjustmentFullyVOModel>>() {};
    }

}

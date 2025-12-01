package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierOtherInoutAuditDTOModel;

import com.nhsoft.neptune.api.domain.SupplierOtherInoutDTOModel;

import java.util.*;

/**
 * supplierOtherInoutAudit请求类
 * 供应商费用单审核
 */
public class OtherinoutSupplierAuditRequest implements ApiCloudRequest<SupplierOtherInoutAuditDTOModel, SupplierOtherInoutDTOModel> {

    private SupplierOtherInoutAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.supplier.audit";
    }

    @Override
    public SupplierOtherInoutAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierOtherInoutAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>>() {};
    }

}

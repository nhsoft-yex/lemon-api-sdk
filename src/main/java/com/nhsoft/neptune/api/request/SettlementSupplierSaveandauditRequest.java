package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementSaveRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import java.util.*;

/**
 * saveAndAuditSupplierSettlement请求类
 * 供应商结算单新增并审核
 */
public class SettlementSupplierSaveandauditRequest implements ApiCloudRequest<SupplierSettlementSaveRequestDTOModel, SupplierSettlementResponseDTOModel> {

    private SupplierSettlementSaveRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.saveandaudit";
    }

    @Override
    public SupplierSettlementSaveRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSettlementSaveRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>>() {};
    }

}

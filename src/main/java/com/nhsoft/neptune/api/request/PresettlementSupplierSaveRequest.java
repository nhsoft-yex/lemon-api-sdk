package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementSaveRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import java.util.*;

/**
 * savePreSupplierSettlement请求类
 * 供应商预付单新增
 */
public class PresettlementSupplierSaveRequest implements ApiCloudRequest<SupplierPreSettlementSaveRequestDTOModel, SupplierPreSettlementResponseDTOModel> {

    private SupplierPreSettlementSaveRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.supplier.save";
    }

    @Override
    public SupplierPreSettlementSaveRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPreSettlementSaveRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>>() {};
    }

}

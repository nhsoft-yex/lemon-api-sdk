package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementSaveRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import java.util.*;

/**
 * saveSupplierSettlement请求类
 * 供应商结算单新增
 */
public class SettlementSupplierSaveRequest implements ApiCloudRequest<SupplierSettlementSaveRequestDTOModel, SupplierSettlementResponseDTOModel> {

    private SupplierSettlementSaveRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.save";
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

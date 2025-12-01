package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementUpdateRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import java.util.*;

/**
 * updateSupplierSettlement请求类
 * 供应商结算单修改
 */
public class SettlementSupplierUpdateRequest implements ApiCloudRequest<SupplierSettlementUpdateRequestDTOModel, SupplierSettlementResponseDTOModel> {

    private SupplierSettlementUpdateRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.update";
    }

    @Override
    public SupplierSettlementUpdateRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSettlementUpdateRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>>() {};
    }

}

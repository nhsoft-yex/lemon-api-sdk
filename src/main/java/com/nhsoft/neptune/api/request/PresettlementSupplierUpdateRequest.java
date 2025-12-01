package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementUpdateRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import java.util.*;

/**
 * updatePreSupplierSettlement请求类
 * 供应商预付单修改
 */
public class PresettlementSupplierUpdateRequest implements ApiCloudRequest<SupplierPreSettlementUpdateRequestDTOModel, SupplierPreSettlementResponseDTOModel> {

    private SupplierPreSettlementUpdateRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.supplier.update";
    }

    @Override
    public SupplierPreSettlementUpdateRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPreSettlementUpdateRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierPreSettlementResponseDTOModel>>() {};
    }

}

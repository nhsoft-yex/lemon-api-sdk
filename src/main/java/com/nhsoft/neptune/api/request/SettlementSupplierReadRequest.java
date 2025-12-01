package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementReadRequestDTOModel;

import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import java.util.*;

/**
 * readSupplierSettlement请求类
 * 供应商结算单读取
 */
public class SettlementSupplierReadRequest implements ApiCloudRequest<SupplierSettlementReadRequestDTOModel, SupplierSettlementResponseDTOModel> {

    private SupplierSettlementReadRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.read";
    }

    @Override
    public SupplierSettlementReadRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSettlementReadRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierSettlementResponseDTOModel>>() {};
    }

}

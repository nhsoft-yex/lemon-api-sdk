package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementFindRequestDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import java.util.*;

/**
 * findSupplierSettlement请求类
 * 供应商结算单查询
 */
public class SettlementSupplierFindRequest implements ApiCloudRequest<SupplierSettlementFindRequestDTOModel, List<SupplierSettlementResponseDTOModel>> {

    private SupplierSettlementFindRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.find";
    }

    @Override
    public SupplierSettlementFindRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSettlementFindRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierSettlementResponseDTOModel>>>() {};
    }

}

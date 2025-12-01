package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementFindRequestDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import java.util.*;

/**
 * findPreSupplierSettlement请求类
 * 供应商预付单查询
 */
public class PresettlementSupplierFindRequest implements ApiCloudRequest<SupplierPreSettlementFindRequestDTOModel, List<SupplierPreSettlementResponseDTOModel>> {

    private SupplierPreSettlementFindRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.supplier.find";
    }

    @Override
    public SupplierPreSettlementFindRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPreSettlementFindRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierPreSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierPreSettlementResponseDTOModel>>>() {};
    }

}

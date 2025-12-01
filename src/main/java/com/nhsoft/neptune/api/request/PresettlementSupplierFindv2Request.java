package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementFindRequestV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.SupplierPreSettlementResponseDTOModel;

import java.util.*;

/**
 * findPreSupplierSettlementV2请求类
 * 供应商预付单查询
 */
public class PresettlementSupplierFindv2Request implements ApiCloudRequest<SupplierPreSettlementFindRequestV2DTOModel, List<SupplierPreSettlementResponseDTOModel>> {

    private SupplierPreSettlementFindRequestV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.supplier.find/v2";
    }

    @Override
    public SupplierPreSettlementFindRequestV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierPreSettlementFindRequestV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierPreSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierPreSettlementResponseDTOModel>>>() {};
    }

}

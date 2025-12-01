package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierSettlementFindRequestV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.SupplierSettlementResponseDTOModel;

import java.util.*;

/**
 * findSupplierSettlementV2请求类
 * 供应商结算单查询
 */
public class SettlementSupplierFindv2Request implements ApiCloudRequest<SupplierSettlementFindRequestV2DTOModel, List<SupplierSettlementResponseDTOModel>> {

    private SupplierSettlementFindRequestV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplier.find/v2";
    }

    @Override
    public SupplierSettlementFindRequestV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierSettlementFindRequestV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierSettlementResponseDTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAgreementSettlementFindRequestDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierAgreementSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.SupplierAgreementSettlementResponseDTOModel;

import java.util.*;

/**
 * findSupplierAgreementSettlement请求类
 * 供应商合同结算单查询
 */
public class SettlementSupplieragreementFindRequest implements ApiCloudRequest<SupplierAgreementSettlementFindRequestDTOModel, List<SupplierAgreementSettlementResponseDTOModel>> {

    private SupplierAgreementSettlementFindRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.supplieragreement.find";
    }

    @Override
    public SupplierAgreementSettlementFindRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAgreementSettlementFindRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierAgreementSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierAgreementSettlementResponseDTOModel>>>() {};
    }

}

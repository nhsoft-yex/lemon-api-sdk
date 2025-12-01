package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAgreementFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierAgreementV2DTOModel;

import com.nhsoft.neptune.api.domain.SupplierAgreementV2DTOModel;

import java.util.*;

/**
 * findSupplierAgreement请求类
 * 供应商合同查询
 */
public class BasicAgreementFindRequest implements ApiCloudRequest<SupplierAgreementFindDTOModel, List<SupplierAgreementV2DTOModel>> {

    private SupplierAgreementFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.agreement.find";
    }

    @Override
    public SupplierAgreementFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAgreementFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierAgreementV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierAgreementV2DTOModel>>>() {};
    }

}

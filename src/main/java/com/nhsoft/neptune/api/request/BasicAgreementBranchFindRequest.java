package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchSupplierAgreementFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchSupplierAgreementV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchSupplierAgreementV2DTOModel;

import java.util.*;

/**
 * findBranchAgreement请求类
 * 门店供应商合同查询
 */
public class BasicAgreementBranchFindRequest implements ApiCloudRequest<BranchSupplierAgreementFindDTOModel, List<BranchSupplierAgreementV2DTOModel>> {

    private BranchSupplierAgreementFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.agreement.branch.find";
    }

    @Override
    public BranchSupplierAgreementFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchSupplierAgreementFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchSupplierAgreementV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchSupplierAgreementV2DTOModel>>>() {};
    }

}

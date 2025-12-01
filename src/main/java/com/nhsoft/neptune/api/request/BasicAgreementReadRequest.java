package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAgreementReadDTOModel;

import com.nhsoft.neptune.api.domain.SupplierAgreementV2DTOModel;

import java.util.*;

/**
 * readSupplierAgreement请求类
 * 供应商合同读取
 */
public class BasicAgreementReadRequest implements ApiCloudRequest<SupplierAgreementReadDTOModel, SupplierAgreementV2DTOModel> {

    private SupplierAgreementReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.agreement.read";
    }

    @Override
    public SupplierAgreementReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAgreementReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierAgreementV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierAgreementV2DTOModel>>() {};
    }

}

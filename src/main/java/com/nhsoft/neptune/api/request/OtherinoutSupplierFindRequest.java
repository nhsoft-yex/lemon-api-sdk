package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierOtherInoutFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierOtherInoutDTOModel;

import com.nhsoft.neptune.api.domain.SupplierOtherInoutDTOModel;

import java.util.*;

/**
 * supplierOtherInoutFind请求类
 * 供应商费用单查询
 */
public class OtherinoutSupplierFindRequest implements ApiCloudRequest<SupplierOtherInoutFindDTOModel, List<SupplierOtherInoutDTOModel>> {

    private SupplierOtherInoutFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.supplier.find";
    }

    @Override
    public SupplierOtherInoutFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierOtherInoutFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierOtherInoutDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierOtherInoutDTOModel>>>() {};
    }

}

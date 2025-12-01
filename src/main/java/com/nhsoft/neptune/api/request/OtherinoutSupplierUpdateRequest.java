package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierOtherInoutUpdateDTOModel;

import com.nhsoft.neptune.api.domain.SupplierOtherInoutDTOModel;

import java.util.*;

/**
 * supplierOtherInoutUpdate请求类
 * 供应商费用单更新
 */
public class OtherinoutSupplierUpdateRequest implements ApiCloudRequest<SupplierOtherInoutUpdateDTOModel, SupplierOtherInoutDTOModel> {

    private SupplierOtherInoutUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.supplier.update";
    }

    @Override
    public SupplierOtherInoutUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierOtherInoutUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>>() {};
    }

}

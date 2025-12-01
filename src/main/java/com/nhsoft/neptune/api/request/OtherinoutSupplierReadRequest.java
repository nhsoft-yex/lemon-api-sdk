package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OtherInoutReadDTOModel;

import com.nhsoft.neptune.api.domain.SupplierOtherInoutDTOModel;

import java.util.*;

/**
 * supplierOtherInoutRead请求类
 * 供应商费用单读取
 */
public class OtherinoutSupplierReadRequest implements ApiCloudRequest<OtherInoutReadDTOModel, SupplierOtherInoutDTOModel> {

    private OtherInoutReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.supplier.read";
    }

    @Override
    public OtherInoutReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OtherInoutReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SupplierOtherInoutDTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierFindRequestDTOModel;

import com.nhsoft.neptune.api.domain.MakeUpOrderSupplierResponseDTOModel;

import java.util.*;

/**
 * findSupplierMakeUpOrder请求类
 * 供应商扣补单查询
 */
public class MakeupSupplierFindRequest implements ApiCloudRequest<MakeUpOrderSupplierFindRequestDTOModel, MakeUpOrderSupplierResponseDTOModel> {

    private MakeUpOrderSupplierFindRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.makeup.supplier.find";
    }

    @Override
    public MakeUpOrderSupplierFindRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MakeUpOrderSupplierFindRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<MakeUpOrderSupplierResponseDTOModel>>() {};
    }

}

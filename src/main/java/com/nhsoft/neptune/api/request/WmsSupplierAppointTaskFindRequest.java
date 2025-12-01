package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAppointTaskFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierAppointTaskVOModel;

import com.nhsoft.neptune.api.domain.SupplierAppointTaskVOModel;

import java.util.*;

/**
 * find_1请求类
 * 送货预约查询
 */
public class WmsSupplierAppointTaskFindRequest implements ApiCloudRequest<SupplierAppointTaskFindDTOModel, List<SupplierAppointTaskVOModel>> {

    private SupplierAppointTaskFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.supplier.appoint.task.find";
    }

    @Override
    public SupplierAppointTaskFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAppointTaskFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierAppointTaskVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierAppointTaskVOModel>>>() {};
    }

}

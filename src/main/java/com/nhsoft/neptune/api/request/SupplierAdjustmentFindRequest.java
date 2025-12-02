package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAdjustmentFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SupplierAdjustmentVOModel;

import com.nhsoft.neptune.api.domain.SupplierAdjustmentVOModel;

import java.util.*;

/**
 * find_16请求类
 * 供应商调价单查询
 */
public class SupplierAdjustmentFindRequest implements ApiCloudRequest<SupplierAdjustmentFindDTOModel, List<SupplierAdjustmentVOModel>> {

    private SupplierAdjustmentFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.supplier.adjustment.find";
    }

    @Override
    public SupplierAdjustmentFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAdjustmentFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SupplierAdjustmentVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SupplierAdjustmentVOModel>>>() {};
    }

}

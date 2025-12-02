package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SupplierAdjustmentReadDTOModel;

import java.util.*;

/**
 * delete_2请求类
 * 供应商调价单删除
 */
public class SupplierAdjustmentDeleteRequest implements ApiCloudRequest<SupplierAdjustmentReadDTOModel, Object> {

    private SupplierAdjustmentReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.supplier.adjustment.delete";
    }

    @Override
    public SupplierAdjustmentReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SupplierAdjustmentReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

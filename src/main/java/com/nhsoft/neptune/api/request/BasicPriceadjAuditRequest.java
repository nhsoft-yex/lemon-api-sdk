package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PriceAdjustmentUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PriceAdjustmentVOModel;

import java.util.*;

/**
 * audit_11请求类
 * 商品调价审核
 */
public class BasicPriceadjAuditRequest implements ApiCloudRequest<PriceAdjustmentUpdateDTOModel, PriceAdjustmentVOModel> {

    private PriceAdjustmentUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.priceadj.audit";
    }

    @Override
    public PriceAdjustmentUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PriceAdjustmentUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PriceAdjustmentVOModel>>() {};
    }

}

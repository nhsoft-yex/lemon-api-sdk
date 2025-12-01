package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesalePriceAdjustOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.WholesalePriceAdjustOrderVOModel;

import java.util.*;

/**
 * auditWholesalePriceAdjust请求类
 * 批发价调整单审核
 */
public class WholesalePriceAdjustAuditRequest implements ApiCloudRequest<WholesalePriceAdjustOrderUpdateDTOModel, WholesalePriceAdjustOrderVOModel> {

    private WholesalePriceAdjustOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.price.adjust.audit";
    }

    @Override
    public WholesalePriceAdjustOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesalePriceAdjustOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesalePriceAdjustOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesalePriceAdjustOrderVOModel>>() {};
    }

}

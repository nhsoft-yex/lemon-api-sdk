package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WholesaleOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.WholesaleOrderVOModel;

import java.util.*;

/**
 * wholesaleOrderSaveAndAudit_1请求类
 * 批发销售单新增并审核
 */
public class WholesaleOrderSaveandauditRequest implements ApiCloudRequest<WholesaleOrderSaveDTOModel, WholesaleOrderVOModel> {

    private WholesaleOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.wholesale.order.saveandaudit";
    }

    @Override
    public WholesaleOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WholesaleOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<WholesaleOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<WholesaleOrderVOModel>>() {};
    }

}

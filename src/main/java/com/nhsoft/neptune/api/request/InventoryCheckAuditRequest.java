package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CheckOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.CheckOrderV3DTOModel;

import java.util.*;

/**
 * checkAudit请求类
 * 库存盘点单审核
 */
public class InventoryCheckAuditRequest implements ApiCloudRequest<CheckOrderUpdateV2DTOModel, CheckOrderV3DTOModel> {

    private CheckOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.check.audit";
    }

    @Override
    public CheckOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CheckOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CheckOrderV3DTOModel>>() {};
    }

}

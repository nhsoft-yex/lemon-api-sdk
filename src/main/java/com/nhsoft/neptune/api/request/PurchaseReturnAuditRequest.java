package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReturnOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.ReturnOrderV2DTOModel;

import java.util.*;

/**
 * returnAudit请求类
 * 退货单审核
 */
public class PurchaseReturnAuditRequest implements ApiCloudRequest<ReturnOrderUpdateV2DTOModel, ReturnOrderV2DTOModel> {

    private ReturnOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.return.audit";
    }

    @Override
    public ReturnOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReturnOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReturnOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReturnOrderV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiptOrderAuditDTOModel;

import com.nhsoft.neptune.api.domain.ReceiptOrderVOModel;

import java.util.*;

/**
 * saveAndAuditReceiptOrder请求类
 * 收款单新增并审核
 */
public class FundReceiptOrderSaveandauditRequest implements ApiCloudRequest<ReceiptOrderAuditDTOModel, ReceiptOrderVOModel> {

    private ReceiptOrderAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receipt.order.saveandaudit";
    }

    @Override
    public ReceiptOrderAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiptOrderAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceiptOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceiptOrderVOModel>>() {};
    }

}

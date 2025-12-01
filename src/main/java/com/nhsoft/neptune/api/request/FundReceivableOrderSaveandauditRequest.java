package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveApplyOrderSaveDTOModel;

import java.util.*;

/**
 * saveAndAuditPayableOrder请求类
 * 应收单新增并审核
 */
public class FundReceivableOrderSaveandauditRequest implements ApiCloudRequest<ReceiveApplyOrderSaveDTOModel, String> {

    private ReceiveApplyOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receivable.order.saveandaudit";
    }

    @Override
    public ReceiveApplyOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveApplyOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<String>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<String>>() {};
    }

}

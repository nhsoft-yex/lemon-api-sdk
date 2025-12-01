package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiptPayLogSaveDTOModel;

import java.util.*;

/**
 * updateReceiptOrderPaylog请求类
 * 收款单支付明细修改
 */
public class FundReceiptOrderPaylogUpdateRequest implements ApiCloudRequest<ReceiptPayLogSaveDTOModel, Object> {

    private ReceiptPayLogSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receipt.order.paylog.update";
    }

    @Override
    public ReceiptPayLogSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiptPayLogSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

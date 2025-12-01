package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiptOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.ReceiptOrderVOModel;

import java.util.*;

/**
 * saveReceiptOrder请求类
 * 收款单新增
 */
public class FundReceiptOrderSaveRequest implements ApiCloudRequest<ReceiptOrderSaveDTOModel, ReceiptOrderVOModel> {

    private ReceiptOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receipt.order.save";
    }

    @Override
    public ReceiptOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiptOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceiptOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceiptOrderVOModel>>() {};
    }

}

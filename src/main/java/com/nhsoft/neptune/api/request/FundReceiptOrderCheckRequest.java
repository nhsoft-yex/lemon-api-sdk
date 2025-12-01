package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FundOrderCheckDTOModel;

import com.nhsoft.neptune.api.domain.ReceiptOrderVOModel;

import java.util.*;

/**
 * check请求类
 * 收款单申诉接口
 */
public class FundReceiptOrderCheckRequest implements ApiCloudRequest<FundOrderCheckDTOModel, ReceiptOrderVOModel> {

    private FundOrderCheckDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receipt.order.check";
    }

    @Override
    public FundOrderCheckDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(FundOrderCheckDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceiptOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceiptOrderVOModel>>() {};
    }

}

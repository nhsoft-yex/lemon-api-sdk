package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiptOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.ReceiptOrderVOModel;

import java.util.*;

/**
 * readReceiptOrder请求类
 * 收款单读取
 */
public class FundReceiptOrderReadRequest implements ApiCloudRequest<ReceiptOrderReadDTOModel, ReceiptOrderVOModel> {

    private ReceiptOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receipt.order.read";
    }

    @Override
    public ReceiptOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiptOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceiptOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceiptOrderVOModel>>() {};
    }

}

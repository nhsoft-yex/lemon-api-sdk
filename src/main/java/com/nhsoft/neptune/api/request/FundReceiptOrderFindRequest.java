package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiptOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReceiptOrderVOModel;

import com.nhsoft.neptune.api.domain.ReceiptOrderVOModel;

import java.util.*;

/**
 * findReceiveOrder请求类
 * 收款单查询
 */
public class FundReceiptOrderFindRequest implements ApiCloudRequest<ReceiptOrderFindDTOModel, List<ReceiptOrderVOModel>> {

    private ReceiptOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receipt.order.find";
    }

    @Override
    public ReceiptOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiptOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReceiptOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReceiptOrderVOModel>>>() {};
    }

}

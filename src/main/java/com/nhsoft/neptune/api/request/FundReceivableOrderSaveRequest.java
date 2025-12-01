package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveApplyOrderSaveDTOModel;

import java.util.*;

/**
 * saveReceivableOrder请求类
 * 应收单新增
 */
public class FundReceivableOrderSaveRequest implements ApiCloudRequest<ReceiveApplyOrderSaveDTOModel, String> {

    private ReceiveApplyOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receivable.order.save";
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

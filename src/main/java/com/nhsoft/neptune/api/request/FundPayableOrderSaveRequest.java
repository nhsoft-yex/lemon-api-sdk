package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayableOrderSaveDTOModel;

import java.util.*;

/**
 * savePayableOrder请求类
 * 应付单新增
 */
public class FundPayableOrderSaveRequest implements ApiCloudRequest<PayableOrderSaveDTOModel, String> {

    private PayableOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payable.order.save";
    }

    @Override
    public PayableOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayableOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<String>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<String>>() {};
    }

}

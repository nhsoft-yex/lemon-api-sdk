package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FundPayableOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.PayableOrderVOModel;

import java.util.*;

/**
 * readPayableOrder请求类
 * 应付单读取
 */
public class FundPayableOrderReadRequest implements ApiCloudRequest<FundPayableOrderReadDTOModel, PayableOrderVOModel> {

    private FundPayableOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payable.order.read";
    }

    @Override
    public FundPayableOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(FundPayableOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PayableOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PayableOrderVOModel>>() {};
    }

}

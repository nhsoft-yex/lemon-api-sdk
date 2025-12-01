package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.FundReceivableOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.ReceivableOrderVOModel;

import java.util.*;

/**
 * readReceivableOrder请求类
 * 应收单读取
 */
public class FundReceivableOrderReadRequest implements ApiCloudRequest<FundReceivableOrderReadDTOModel, ReceivableOrderVOModel> {

    private FundReceivableOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receivable.order.read";
    }

    @Override
    public FundReceivableOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(FundReceivableOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceivableOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceivableOrderVOModel>>() {};
    }

}

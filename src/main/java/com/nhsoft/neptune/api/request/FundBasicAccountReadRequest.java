package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SettlementAccountReadDTOModel;

import com.nhsoft.neptune.api.domain.SettlementAccountVOModel;

import java.util.*;

/**
 * readBasicAccount请求类
 * 资金账户读取
 */
public class FundBasicAccountReadRequest implements ApiCloudRequest<SettlementAccountReadDTOModel, SettlementAccountVOModel> {

    private SettlementAccountReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.basic.account.read";
    }

    @Override
    public SettlementAccountReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SettlementAccountReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SettlementAccountVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SettlementAccountVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SettlementBalanceReadDTOModel;

import com.nhsoft.neptune.api.domain.SettlementBalanceVOModel;

import java.util.*;

/**
 * readBasicAllpayAccount请求类
 * 资金支付聚合账户读取
 */
public class FundBasicBalanceReadRequest implements ApiCloudRequest<SettlementBalanceReadDTOModel, SettlementBalanceVOModel> {

    private SettlementBalanceReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.basic.balance.read";
    }

    @Override
    public SettlementBalanceReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SettlementBalanceReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SettlementBalanceVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SettlementBalanceVOModel>>() {};
    }

}

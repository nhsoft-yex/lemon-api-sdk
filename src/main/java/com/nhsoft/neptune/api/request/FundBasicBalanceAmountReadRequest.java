package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AccountBalanceReadDTOModel;

import com.nhsoft.neptune.api.domain.AccountBalanceVOModel;

import java.util.*;

/**
 * readAccountBalance请求类
 * 账户余额读取
 */
public class FundBasicBalanceAmountReadRequest implements ApiCloudRequest<AccountBalanceReadDTOModel, AccountBalanceVOModel> {

    private AccountBalanceReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.basic.balance.amount.read";
    }

    @Override
    public AccountBalanceReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AccountBalanceReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AccountBalanceVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AccountBalanceVOModel>>() {};
    }

}

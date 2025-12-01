package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AccountDepositReadV2DTOModel;

import com.nhsoft.neptune.api.domain.AccountDepositV2DTOModel;

import java.util.*;

/**
 * depositRead请求类
 * 门店账户充值单读取
 */
public class AccountDepositReadRequest implements ApiCloudRequest<AccountDepositReadV2DTOModel, AccountDepositV2DTOModel> {

    private AccountDepositReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.account.deposit.read";
    }

    @Override
    public AccountDepositReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AccountDepositReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AccountDepositV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AccountDepositV2DTOModel>>() {};
    }

}

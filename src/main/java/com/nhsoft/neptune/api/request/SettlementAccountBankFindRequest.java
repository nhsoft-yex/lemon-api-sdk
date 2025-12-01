package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AccountBankFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AccountBankV2DTOModel;

import com.nhsoft.neptune.api.domain.AccountBankV2DTOModel;

import java.util.*;

/**
 * findAccountBanck请求类
 * 现金银行查询
 */
public class SettlementAccountBankFindRequest implements ApiCloudRequest<AccountBankFindV2DTOModel, List<AccountBankV2DTOModel>> {

    private AccountBankFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.account.bank.find";
    }

    @Override
    public AccountBankFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AccountBankFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AccountBankV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AccountBankV2DTOModel>>>() {};
    }

}

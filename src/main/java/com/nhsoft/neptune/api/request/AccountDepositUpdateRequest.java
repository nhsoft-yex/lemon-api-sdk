package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AccountDepositUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.AccountDepositV2DTOModel;

import java.util.*;

/**
 * accountDepositUpdate请求类
 * 门店账户充值单修改
 */
public class AccountDepositUpdateRequest implements ApiCloudRequest<AccountDepositUpdateV2DTOModel, AccountDepositV2DTOModel> {

    private AccountDepositUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.account.deposit.update";
    }

    @Override
    public AccountDepositUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AccountDepositUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AccountDepositV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AccountDepositV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AccountDepositSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.AccountDepositV2DTOModel;

import java.util.*;

/**
 * accountDepositSave请求类
 * 门店账户充值单保存
 */
public class AccountDepositSaveRequest implements ApiCloudRequest<AccountDepositSaveV2DTOModel, AccountDepositV2DTOModel> {

    private AccountDepositSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.account.deposit.save";
    }

    @Override
    public AccountDepositSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AccountDepositSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AccountDepositV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AccountDepositV2DTOModel>>() {};
    }

}

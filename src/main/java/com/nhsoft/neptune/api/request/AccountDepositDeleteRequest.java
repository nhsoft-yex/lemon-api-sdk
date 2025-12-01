package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AccountDepositReadV2DTOModel;

import java.util.*;

/**
 * accountDepositDelete请求类
 * 门店账户充值单删除
 */
public class AccountDepositDeleteRequest implements ApiCloudRequest<AccountDepositReadV2DTOModel, Void> {

    private AccountDepositReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.account.deposit.delete";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

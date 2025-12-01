package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AccountDepositFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.AccountDepositV2DTOModel;

import com.nhsoft.neptune.api.domain.AccountDepositV2DTOModel;

import java.util.*;

/**
 * accountDepositFindV2请求类
 * 门店账户充值单查询
 */
public class AccountDepositFindv2Request implements ApiCloudRequest<AccountDepositFindV3DTOModel, List<AccountDepositV2DTOModel>> {

    private AccountDepositFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.account.deposit.find/v2";
    }

    @Override
    public AccountDepositFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AccountDepositFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<AccountDepositV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<AccountDepositV2DTOModel>>>() {};
    }

}

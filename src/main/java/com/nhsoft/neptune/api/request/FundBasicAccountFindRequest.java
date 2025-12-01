package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SettlementAccountFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SettlementAccountVOModel;

import com.nhsoft.neptune.api.domain.SettlementAccountVOModel;

import java.util.*;

/**
 * findBasicAccount请求类
 * 资金账户查询
 */
public class FundBasicAccountFindRequest implements ApiCloudRequest<SettlementAccountFindDTOModel, List<SettlementAccountVOModel>> {

    private SettlementAccountFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.basic.account.find";
    }

    @Override
    public SettlementAccountFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SettlementAccountFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SettlementAccountVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SettlementAccountVOModel>>>() {};
    }

}

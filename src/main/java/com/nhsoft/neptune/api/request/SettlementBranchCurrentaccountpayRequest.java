package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchCurrentAccountPayFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CurrentAccountPayDTOModel;

import com.nhsoft.neptune.api.domain.CurrentAccountPayDTOModel;

import java.util.*;

/**
 * findbranchCurrentAccountPay请求类
 * 门店往来账款-期内应收账款(门店汇总)
 */
public class SettlementBranchCurrentaccountpayRequest implements ApiCloudRequest<BranchCurrentAccountPayFindDTOModel, List<CurrentAccountPayDTOModel>> {

    private BranchCurrentAccountPayFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branch.currentaccountpay";
    }

    @Override
    public BranchCurrentAccountPayFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchCurrentAccountPayFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CurrentAccountPayDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CurrentAccountPayDTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerMarketingSettlementFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CoinWalletSettlementVOModel;

import com.nhsoft.neptune.api.domain.CoinWalletSettlementVOModel;

import java.util.*;

/**
 * findConsume_1请求类
 * 会员营销结算查询-次卡
 */
public class CustomerMarketingSettlementExchangecardFindRequest implements ApiCloudRequest<CustomerMarketingSettlementFindDTOModel, List<CoinWalletSettlementVOModel>> {

    private CustomerMarketingSettlementFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.marketing.settlement.exchangecard.find";
    }

    @Override
    public CustomerMarketingSettlementFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerMarketingSettlementFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CoinWalletSettlementVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CoinWalletSettlementVOModel>>>() {};
    }

}

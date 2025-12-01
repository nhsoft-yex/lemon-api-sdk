package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CustomerMarketingSettlementDetailFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CoinWalletSettlementDetailVOModel;

import com.nhsoft.neptune.api.domain.CoinWalletSettlementDetailVOModel;

import java.util.*;

/**
 * findConsume_2请求类
 * 会员营销结算明细查询-次卡
 */
public class CustomerMarketingSettlementExchangecardDetailFindRequest implements ApiCloudRequest<CustomerMarketingSettlementDetailFindDTOModel, List<CoinWalletSettlementDetailVOModel>> {

    private CustomerMarketingSettlementDetailFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.customer.marketing.settlement.exchangecard.detail.find";
    }

    @Override
    public CustomerMarketingSettlementDetailFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CustomerMarketingSettlementDetailFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CoinWalletSettlementDetailVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CoinWalletSettlementDetailVOModel>>>() {};
    }

}

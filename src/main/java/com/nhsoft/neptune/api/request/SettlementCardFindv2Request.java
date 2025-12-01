package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardSettlementFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardSettlementV2DTOModel;

import com.nhsoft.neptune.api.domain.CardSettlementV2DTOModel;

import java.util.*;

/**
 * cardSettlementFindV2请求类
 * 会员卡结算单查询(资金)
 */
public class SettlementCardFindv2Request implements ApiCloudRequest<CardSettlementFindV2DTOModel, List<CardSettlementV2DTOModel>> {

    private CardSettlementFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.card.find/v2";
    }

    @Override
    public CardSettlementFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardSettlementFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardSettlementV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardSettlementV2DTOModel>>>() {};
    }

}

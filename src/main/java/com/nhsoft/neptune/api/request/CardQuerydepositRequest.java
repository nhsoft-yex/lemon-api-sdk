package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardDepositByOutTradeNoDTOModel;

import com.nhsoft.neptune.api.domain.CardDepositV3DTOModel;

import java.util.*;

/**
 * cardOnlineAntiDeposit_1请求类
 * 存款单据查询
 */
public class CardQuerydepositRequest implements ApiCloudRequest<CardDepositByOutTradeNoDTOModel, CardDepositV3DTOModel> {

    private CardDepositByOutTradeNoDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.querydeposit";
    }

    @Override
    public CardDepositByOutTradeNoDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardDepositByOutTradeNoDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardDepositV3DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardDepositV3DTOModel>>() {};
    }

}

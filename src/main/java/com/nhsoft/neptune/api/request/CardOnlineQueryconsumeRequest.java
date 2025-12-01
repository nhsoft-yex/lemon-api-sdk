package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardConsumeByOutTradeNoDTOModel;

import java.util.*;

/**
 * queryCardConsume请求类
 */
public class CardOnlineQueryconsumeRequest implements ApiCloudRequest<CardConsumeByOutTradeNoDTOModel, Void> {

    private CardConsumeByOutTradeNoDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.online.queryconsume";
    }

    @Override
    public CardConsumeByOutTradeNoDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardConsumeByOutTradeNoDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

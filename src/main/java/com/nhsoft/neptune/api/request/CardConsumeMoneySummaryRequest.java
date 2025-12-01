package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserTypeConsumeMoneySummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserTypeConsumeMoneySummaryDTOModel;

import com.nhsoft.neptune.api.domain.CardUserTypeConsumeMoneySummaryDTOModel;

import java.util.*;

/**
 * summaryCardUserConsumeMoney请求类
 * 按卡类型汇总查询卡消费金额
 */
public class CardConsumeMoneySummaryRequest implements ApiCloudRequest<CardUserTypeConsumeMoneySummaryFindDTOModel, List<CardUserTypeConsumeMoneySummaryDTOModel>> {

    private CardUserTypeConsumeMoneySummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.consume.money.summary";
    }

    @Override
    public CardUserTypeConsumeMoneySummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserTypeConsumeMoneySummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardUserTypeConsumeMoneySummaryDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserTypeConsumeMoneySummaryDTOModel>>>() {};
    }

}

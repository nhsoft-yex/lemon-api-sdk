package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserTypeDepositMoneySummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserTypeDepositMoneySummaryDTOModel;

import com.nhsoft.neptune.api.domain.CardUserTypeDepositMoneySummaryDTOModel;

import java.util.*;

/**
 * summaryCardUserDepositMoney请求类
 * 按卡类型汇总查询卡存款金额
 */
public class CardDepositMoneySummaryRequest implements ApiCloudRequest<CardUserTypeDepositMoneySummaryFindDTOModel, List<CardUserTypeDepositMoneySummaryDTOModel>> {

    private CardUserTypeDepositMoneySummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.deposit.money.summary";
    }

    @Override
    public CardUserTypeDepositMoneySummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserTypeDepositMoneySummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardUserTypeDepositMoneySummaryDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserTypeDepositMoneySummaryDTOModel>>>() {};
    }

}

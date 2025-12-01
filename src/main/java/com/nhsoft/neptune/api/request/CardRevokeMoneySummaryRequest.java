package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserTypeRevokeMoneySummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserTypeRevokeMoneySummaryDTOModel;

import com.nhsoft.neptune.api.domain.CardUserTypeRevokeMoneySummaryDTOModel;

import java.util.*;

/**
 * summaryCardUserRecycleMoney请求类
 * 按卡类型汇总查询卡回收金额
 */
public class CardRevokeMoneySummaryRequest implements ApiCloudRequest<CardUserTypeRevokeMoneySummaryFindDTOModel, List<CardUserTypeRevokeMoneySummaryDTOModel>> {

    private CardUserTypeRevokeMoneySummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.revoke.money.summary";
    }

    @Override
    public CardUserTypeRevokeMoneySummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserTypeRevokeMoneySummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardUserTypeRevokeMoneySummaryDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserTypeRevokeMoneySummaryDTOModel>>>() {};
    }

}

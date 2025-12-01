package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserTypeBalanceMoneySummaryDTOModel;

import com.nhsoft.neptune.api.domain.CardUserTypeBalanceMoneySummaryDTOModel;

import java.util.*;

/**
 * summaryCardUserBalanceMoney请求类
 * 按卡类型汇总查询卡余额
 */
public class CardBalanceMoneySummaryRequest implements ApiCloudRequest<Void, List<CardUserTypeBalanceMoneySummaryDTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.balance.money.summary";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardUserTypeBalanceMoneySummaryDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserTypeBalanceMoneySummaryDTOModel>>>() {};
    }

}

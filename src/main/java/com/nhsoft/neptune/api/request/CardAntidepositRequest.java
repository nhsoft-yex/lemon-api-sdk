package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardAntiDepositDTOModel;

import com.nhsoft.neptune.api.domain.CardOnlineAntiDepositDTOModel;

import java.util.*;

/**
 * cardOnlineAntiDeposit请求类
 * 反存款
 */
public class CardAntidepositRequest implements ApiCloudRequest<CardAntiDepositDTOModel, CardOnlineAntiDepositDTOModel> {

    private CardAntiDepositDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.antideposit";
    }

    @Override
    public CardAntiDepositDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardAntiDepositDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardOnlineAntiDepositDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardOnlineAntiDepositDTOModel>>() {};
    }

}

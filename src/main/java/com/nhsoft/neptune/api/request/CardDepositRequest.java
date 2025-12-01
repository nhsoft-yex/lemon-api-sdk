package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOnlineDepositV2DTOModel;

import com.nhsoft.neptune.api.domain.CardDepositV2DTOModel;

import java.util.*;

/**
 * cardOnlineDeposit请求类
 * 线上存款
 */
public class CardDepositRequest implements ApiCloudRequest<CardOnlineDepositV2DTOModel, CardDepositV2DTOModel> {

    private CardOnlineDepositV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.deposit";
    }

    @Override
    public CardOnlineDepositV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardOnlineDepositV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardDepositV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardDepositV2DTOModel>>() {};
    }

}

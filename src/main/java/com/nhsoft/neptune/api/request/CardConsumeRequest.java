package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOnlineConsumeV2DTOModel;

import com.nhsoft.neptune.api.domain.CardConsumeVOModel;

import java.util.*;

/**
 * cardOnlineConsume请求类
 * 线上消费
 */
public class CardConsumeRequest implements ApiCloudRequest<CardOnlineConsumeV2DTOModel, CardConsumeVOModel> {

    private CardOnlineConsumeV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.consume";
    }

    @Override
    public CardOnlineConsumeV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardOnlineConsumeV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardConsumeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardConsumeVOModel>>() {};
    }

}

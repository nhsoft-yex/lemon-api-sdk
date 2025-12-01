package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardAntiConsumeSaveDTOModel;

import com.nhsoft.neptune.api.domain.CardAntiConsumeVOModel;

import java.util.*;

/**
 * cardOnlineAnticonsume请求类
 * 反消费
 */
public class CardAnticonsumeRequest implements ApiCloudRequest<CardAntiConsumeSaveDTOModel, CardAntiConsumeVOModel> {

    private CardAntiConsumeSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.anticonsume";
    }

    @Override
    public CardAntiConsumeSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardAntiConsumeSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardAntiConsumeVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardAntiConsumeVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardLevelUpdateDTOModel;

import java.util.*;

/**
 * updateCardLevel请求类
 * 全渠道会员身份等级调整
 */
public class CardLevelRequest implements ApiCloudRequest<CardLevelUpdateDTOModel, Void> {

    private CardLevelUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.level";
    }

    @Override
    public CardLevelUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardLevelUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

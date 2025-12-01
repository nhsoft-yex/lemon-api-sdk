package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardInitV2DTOModel;

import java.util.*;

/**
 * initCard请求类
 * 储值卡初始化
 */
public class CardInitRequest implements ApiCloudRequest<CardInitV2DTOModel, Void> {

    private CardInitV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.init";
    }

    @Override
    public CardInitV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardInitV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

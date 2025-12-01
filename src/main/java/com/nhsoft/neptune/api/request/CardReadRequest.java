package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserReadDTOModel;

import com.nhsoft.neptune.api.domain.CardUserProxyDTOModel;

import java.util.*;

/**
 * readCard请求类
 * 读取会储值卡
 */
public class CardReadRequest implements ApiCloudRequest<CardUserReadDTOModel, CardUserProxyDTOModel> {

    private CardUserReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.read";
    }

    @Override
    public CardUserReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardUserProxyDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardUserProxyDTOModel>>() {};
    }

}

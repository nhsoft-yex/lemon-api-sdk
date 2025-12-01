package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserSimpleDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardReplaceResponseVOModel;

import com.nhsoft.neptune.api.domain.CardReplaceResponseVOModel;

import java.util.*;

/**
 * replaceCardLog请求类
 * 储值卡换卡记录
 */
public class CardReplacelogFindRequest implements ApiCloudRequest<CardUserSimpleDTOModel, List<CardReplaceResponseVOModel>> {

    private CardUserSimpleDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.replacelog.find";
    }

    @Override
    public CardUserSimpleDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserSimpleDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardReplaceResponseVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardReplaceResponseVOModel>>>() {};
    }

}

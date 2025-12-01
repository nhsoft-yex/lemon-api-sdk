package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserSimpleDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserLogVOModel;

import com.nhsoft.neptune.api.domain.CardUserLogVOModel;

import java.util.*;

/**
 * revokeCardLog请求类
 * 储值卡回收记录
 */
public class CardRevokelogFindRequest implements ApiCloudRequest<CardUserSimpleDTOModel, List<CardUserLogVOModel>> {

    private CardUserSimpleDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.revokelog.find";
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
    public TypeReference<ApiCloudResponse<List<CardUserLogVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserLogVOModel>>>() {};
    }

}

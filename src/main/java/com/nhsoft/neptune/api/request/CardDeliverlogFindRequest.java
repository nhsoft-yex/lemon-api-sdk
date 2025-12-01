package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserSimpleDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserRegisterVOModel;

import com.nhsoft.neptune.api.domain.CardUserRegisterVOModel;

import java.util.*;

/**
 * deliverCardLog请求类
 * 储值卡发卡记录
 */
public class CardDeliverlogFindRequest implements ApiCloudRequest<CardUserSimpleDTOModel, List<CardUserRegisterVOModel>> {

    private CardUserSimpleDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.deliverlog.find";
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
    public TypeReference<ApiCloudResponse<List<CardUserRegisterVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserRegisterVOModel>>>() {};
    }

}

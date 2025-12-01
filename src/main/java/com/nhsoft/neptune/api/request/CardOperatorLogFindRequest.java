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
 * findCardLockLog请求类
 * 查询储值卡操作日志
 */
public class CardOperatorLogFindRequest implements ApiCloudRequest<CardUserSimpleDTOModel, List<CardUserLogVOModel>> {

    private CardUserSimpleDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.operator.log.find";
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

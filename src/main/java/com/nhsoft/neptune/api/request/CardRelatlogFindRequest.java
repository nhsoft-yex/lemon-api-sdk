package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserSimpleDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.RelatCardResponseDTOModel;

import com.nhsoft.neptune.api.domain.RelatCardResponseDTOModel;

import java.util.*;

/**
 * relatCardLog请求类
 * 储值卡续卡记录
 */
public class CardRelatlogFindRequest implements ApiCloudRequest<CardUserSimpleDTOModel, List<RelatCardResponseDTOModel>> {

    private CardUserSimpleDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.relatlog.find";
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
    public TypeReference<ApiCloudResponse<List<RelatCardResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<RelatCardResponseDTOModel>>>() {};
    }

}

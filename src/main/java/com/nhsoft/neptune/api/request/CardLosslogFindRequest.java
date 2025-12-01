package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardLossLogReqDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardLossResponseDTOModel;

import com.nhsoft.neptune.api.domain.CardLossResponseDTOModel;

import java.util.*;

/**
 * lossCardLog请求类
 * 储值卡挂失解挂记录
 */
public class CardLosslogFindRequest implements ApiCloudRequest<CardLossLogReqDTOModel, List<CardLossResponseDTOModel>> {

    private CardLossLogReqDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.losslog.find";
    }

    @Override
    public CardLossLogReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardLossLogReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardLossResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardLossResponseDTOModel>>>() {};
    }

}

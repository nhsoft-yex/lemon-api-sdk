package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardLossReqDTOModel;

import com.nhsoft.neptune.api.domain.CardLossResponseDTOModel;

import java.util.*;

/**
 * cancelLossCard请求类
 * 储值卡解挂
 */
public class CardCancellossRequest implements ApiCloudRequest<CardLossReqDTOModel, CardLossResponseDTOModel> {

    private CardLossReqDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.cancelloss";
    }

    @Override
    public CardLossReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardLossReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardLossResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardLossResponseDTOModel>>() {};
    }

}

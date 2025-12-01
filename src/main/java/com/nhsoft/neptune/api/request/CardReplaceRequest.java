package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardReplaceReqDTOModel;

import com.nhsoft.neptune.api.domain.CardReplaceResponseVOModel;

import java.util.*;

/**
 * replaceCard请求类
 * 储值卡换卡
 */
public class CardReplaceRequest implements ApiCloudRequest<CardReplaceReqDTOModel, CardReplaceResponseVOModel> {

    private CardReplaceReqDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.replace";
    }

    @Override
    public CardReplaceReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardReplaceReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardReplaceResponseVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardReplaceResponseVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardBindReqDTOModel;

import java.util.*;

/**
 * bindCard_1请求类
 * 储值卡绑定会员
 */
public class CardBindRequest implements ApiCloudRequest<CardBindReqDTOModel, Void> {

    private CardBindReqDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.bind";
    }

    @Override
    public CardBindReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardBindReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUnBindReqDTOModel;

import java.util.*;

/**
 * unbindCard请求类
 * 储值卡解绑会员
 */
public class CardUnbindRequest implements ApiCloudRequest<CardUnBindReqDTOModel, Void> {

    private CardUnBindReqDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.unbind";
    }

    @Override
    public CardUnBindReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUnBindReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

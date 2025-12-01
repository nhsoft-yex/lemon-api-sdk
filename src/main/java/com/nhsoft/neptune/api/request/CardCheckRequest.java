package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardCheckReqDTOModel;

import java.util.*;

/**
 * checkCard请求类
 * 储值卡密码校验
 */
public class CardCheckRequest implements ApiCloudRequest<CardCheckReqDTOModel, Void> {

    private CardCheckReqDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.check";
    }

    @Override
    public CardCheckReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardCheckReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

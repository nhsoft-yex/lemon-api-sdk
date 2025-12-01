package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserUpdateDTOModel;

import java.util.*;

/**
 * updateCard请求类
 * 更新会员信息
 */
public class CardUpdateRequest implements ApiCloudRequest<CardUserUpdateDTOModel, Void> {

    private CardUserUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.update";
    }

    @Override
    public CardUserUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

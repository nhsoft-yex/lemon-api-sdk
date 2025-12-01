package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardRevokeReqDTOModel;

import java.util.*;

/**
 * revokeCard请求类
 * 储值卡回收
 */
public class CardRevokeRequest implements ApiCloudRequest<CardRevokeReqDTOModel, Void> {

    private CardRevokeReqDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.revoke";
    }

    @Override
    public CardRevokeReqDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardRevokeReqDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

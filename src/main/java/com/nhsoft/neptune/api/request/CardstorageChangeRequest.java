package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardStorageChangeDTOModel;

import java.util.*;

/**
 * changeCardStorage请求类
 * 更换卡介质
 */
public class CardstorageChangeRequest implements ApiCloudRequest<CardStorageChangeDTOModel, Void> {

    private CardStorageChangeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.cardstorage.change";
    }

    @Override
    public CardStorageChangeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardStorageChangeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOrderSimpleDTOModel;

import java.util.*;

/**
 * deleteCardOrder请求类
 * 团购制卡废弃
 */
public class CardorderDeleteRequest implements ApiCloudRequest<CardOrderSimpleDTOModel, Void> {

    private CardOrderSimpleDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.cardorder.delete";
    }

    @Override
    public CardOrderSimpleDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardOrderSimpleDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

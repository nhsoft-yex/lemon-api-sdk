package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOrderSimpleDTOModel;

import com.nhsoft.neptune.api.domain.CardOrderResponseDTOModel;

import java.util.*;

/**
 * readCardOrder请求类
 * 团购制卡读取
 */
public class CardorderReadRequest implements ApiCloudRequest<CardOrderSimpleDTOModel, CardOrderResponseDTOModel> {

    private CardOrderSimpleDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.cardorder.read";
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
    public TypeReference<ApiCloudResponse<CardOrderResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardOrderResponseDTOModel>>() {};
    }

}

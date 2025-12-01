package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardOrderResponseDTOModel;

import com.nhsoft.neptune.api.domain.CardOrderResponseDTOModel;

import java.util.*;

/**
 * findCardOrder请求类
 * 团购制卡查询
 */
public class CardorderFindRequest implements ApiCloudRequest<CardOrderFindDTOModel, List<CardOrderResponseDTOModel>> {

    private CardOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.cardorder.find";
    }

    @Override
    public CardOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardOrderResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardOrderResponseDTOModel>>>() {};
    }

}

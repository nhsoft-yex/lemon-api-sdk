package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardUserNumDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardConsumeResponseDTOModel;

import com.nhsoft.neptune.api.domain.CardConsumeResponseDTOModel;

import java.util.*;

/**
 * cardConsumeQuery请求类
 * 根据会员或门店查询消费记录
 */
public class CardConsumeFindRequest implements ApiCloudRequest<CardUserNumDTOModel, List<CardConsumeResponseDTOModel>> {

    private CardUserNumDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.consume.find";
    }

    @Override
    public CardUserNumDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardUserNumDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardConsumeResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardConsumeResponseDTOModel>>>() {};
    }

}

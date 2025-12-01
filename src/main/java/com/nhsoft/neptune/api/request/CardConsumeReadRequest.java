package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardConsumeReadByOrderNoDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardConsumeResponseDTOModel;

import com.nhsoft.neptune.api.domain.CardConsumeResponseDTOModel;

import java.util.*;

/**
 * readCardConsume请求类
 * 根据销售单号读取消费记录
 */
public class CardConsumeReadRequest implements ApiCloudRequest<CardConsumeReadByOrderNoDTOModel, List<CardConsumeResponseDTOModel>> {

    private CardConsumeReadByOrderNoDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.consume.read";
    }

    @Override
    public CardConsumeReadByOrderNoDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardConsumeReadByOrderNoDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardConsumeResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardConsumeResponseDTOModel>>>() {};
    }

}

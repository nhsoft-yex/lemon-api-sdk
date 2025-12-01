package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ExchangeCardFindExchangeDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ExchangeCardExchangeVOModel;

import com.nhsoft.neptune.api.domain.ExchangeCardExchangeVOModel;

import java.util.*;

/**
 * findConsume请求类
 * 次卡消费记录查询
 */
public class ExchangeCardConsumeFindRequest implements ApiCloudRequest<ExchangeCardFindExchangeDTOModel, List<ExchangeCardExchangeVOModel>> {

    private ExchangeCardFindExchangeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.exchange.card.consume.find";
    }

    @Override
    public ExchangeCardFindExchangeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ExchangeCardFindExchangeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ExchangeCardExchangeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ExchangeCardExchangeVOModel>>>() {};
    }

}

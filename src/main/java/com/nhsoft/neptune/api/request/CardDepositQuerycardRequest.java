package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardDepositFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardDepositV2DTOModel;

import com.nhsoft.neptune.api.domain.CardDepositV2DTOModel;

import java.util.*;

/**
 * cardDepositQuery请求类
 * 根据会员卡或门店查询存款记录(默认返回最近营业日的20条)
 */
public class CardDepositQuerycardRequest implements ApiCloudRequest<CardDepositFindDTOModel, List<CardDepositV2DTOModel>> {

    private CardDepositFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.deposit.querycard";
    }

    @Override
    public CardDepositFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardDepositFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardDepositV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardDepositV2DTOModel>>>() {};
    }

}

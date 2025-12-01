package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardDepositDateTypeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardDepositV2DTOModel;

import com.nhsoft.neptune.api.domain.CardDepositV2DTOModel;

import java.util.*;

/**
 * findCardDepositDeposit请求类
 * 根据时间类型查询存款记录
 */
public class CardDepositFindRequest implements ApiCloudRequest<CardDepositDateTypeFindDTOModel, List<CardDepositV2DTOModel>> {

    private CardDepositDateTypeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.deposit.find";
    }

    @Override
    public CardDepositDateTypeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardDepositDateTypeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardDepositV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardDepositV2DTOModel>>>() {};
    }

}

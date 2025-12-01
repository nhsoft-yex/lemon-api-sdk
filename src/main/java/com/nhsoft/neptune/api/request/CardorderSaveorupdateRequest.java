package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.CardOrderResponseDTOModel;

import java.util.*;

/**
 * saveCardOrder请求类
 * 团购制卡保存或修改
 */
public class CardorderSaveorupdateRequest implements ApiCloudRequest<CardOrderSaveDTOModel, CardOrderResponseDTOModel> {

    private CardOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.cardorder.saveorupdate";
    }

    @Override
    public CardOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardOrderResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardOrderResponseDTOModel>>() {};
    }

}

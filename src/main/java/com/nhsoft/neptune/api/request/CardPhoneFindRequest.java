package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardPhoneFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserProxyDTOModel;

import com.nhsoft.neptune.api.domain.CardUserProxyDTOModel;

import java.util.*;

/**
 * cardPhoneFind请求类
 * 根据手机号码查找有效会员列表
 */
public class CardPhoneFindRequest implements ApiCloudRequest<CardPhoneFindDTOModel, List<CardUserProxyDTOModel>> {

    private CardPhoneFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.phone.find";
    }

    @Override
    public CardPhoneFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardPhoneFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardUserProxyDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserProxyDTOModel>>>() {};
    }

}

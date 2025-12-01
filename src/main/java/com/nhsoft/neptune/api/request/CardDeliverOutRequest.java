package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MemberCardOutV2DTOModel;

import com.nhsoft.neptune.api.domain.CardUserProxyDTOModel;

import java.util.*;

/**
 * cardDeliverOld请求类
 */
public class CardDeliverOutRequest implements ApiCloudRequest<MemberCardOutV2DTOModel, CardUserProxyDTOModel> {

    private MemberCardOutV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.deliver.out";
    }

    @Override
    public MemberCardOutV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MemberCardOutV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<CardUserProxyDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<CardUserProxyDTOModel>>() {};
    }

}

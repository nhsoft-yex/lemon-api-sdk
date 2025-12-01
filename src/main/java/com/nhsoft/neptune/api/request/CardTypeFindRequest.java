package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.CardUserTypeV2DTOModel;

import com.nhsoft.neptune.api.domain.CardUserTypeV2DTOModel;

import java.util.*;

/**
 * findCardUserType请求类
 * 查询卡类型
 */
public class CardTypeFindRequest implements ApiCloudRequest<Void, List<CardUserTypeV2DTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.card.type.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardUserTypeV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardUserTypeV2DTOModel>>>() {};
    }

}

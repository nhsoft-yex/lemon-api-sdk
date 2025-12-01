package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardPointOnlineV2DTOModel;

import java.util.*;

/**
 * addCardPointOnline请求类
 * 积分线上调整
 */
public class PointAddRequest implements ApiCloudRequest<CardPointOnlineV2DTOModel, Void> {

    private CardPointOnlineV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point.add";
    }

    @Override
    public CardPointOnlineV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardPointOnlineV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

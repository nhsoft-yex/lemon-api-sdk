package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardClientPointFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardClientPointDTOModel;

import com.nhsoft.neptune.api.domain.CardClientPointDTOModel;

import java.util.*;

/**
 * cardClientPointFindV2请求类
 * 积分明细查询
 */
public class PointFindv2Request implements ApiCloudRequest<CardClientPointFindV2DTOModel, List<CardClientPointDTOModel>> {

    private CardClientPointFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point.find/v2";
    }

    @Override
    public CardClientPointFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardClientPointFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardClientPointDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardClientPointDTOModel>>>() {};
    }

}

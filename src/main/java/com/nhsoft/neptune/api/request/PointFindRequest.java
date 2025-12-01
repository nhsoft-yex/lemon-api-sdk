package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardClientPointFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.CardClientPointDTOModel;

import com.nhsoft.neptune.api.domain.CardClientPointDTOModel;

import java.util.*;

/**
 * cardClientPointFind请求类
 * 积分明细查询
 */
public class PointFindRequest implements ApiCloudRequest<CardClientPointFindDTOModel, List<CardClientPointDTOModel>> {

    private CardClientPointFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point.find";
    }

    @Override
    public CardClientPointFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardClientPointFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<CardClientPointDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<CardClientPointDTOModel>>>() {};
    }

}

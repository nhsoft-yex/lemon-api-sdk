package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.CardPointV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PointDetailV2DTOModel;

import com.nhsoft.neptune.api.domain.PointDetailV2DTOModel;

import java.util.*;

/**
 * cardClientpoint请求类
 * 会员积分变动查询
 */
public class PointRequest implements ApiCloudRequest<CardPointV2DTOModel, List<PointDetailV2DTOModel>> {

    private CardPointV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.point";
    }

    @Override
    public CardPointV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(CardPointV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PointDetailV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PointDetailV2DTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.MarketActionFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.MarketActionVOModel;

import com.nhsoft.neptune.api.domain.MarketActionVOModel;

import java.util.*;

/**
 * find_20请求类
 * 查询营销活动
 */
public class MarketActionFindRequest implements ApiCloudRequest<MarketActionFindDTOModel, List<MarketActionVOModel>> {

    private MarketActionFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.market.action.find";
    }

    @Override
    public MarketActionFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(MarketActionFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<MarketActionVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<MarketActionVOModel>>>() {};
    }

}

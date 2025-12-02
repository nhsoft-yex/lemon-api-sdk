package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PointOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PointOrderVOModel;

import com.nhsoft.neptune.api.domain.PointOrderVOModel;

import java.util.*;

/**
 * find_19请求类
 * 积分活动查询
 */
public class PointorderFindRequest implements ApiCloudRequest<PointOrderFindDTOModel, List<PointOrderVOModel>> {

    private PointOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pointorder.find";
    }

    @Override
    public PointOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PointOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PointOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PointOrderVOModel>>>() {};
    }

}

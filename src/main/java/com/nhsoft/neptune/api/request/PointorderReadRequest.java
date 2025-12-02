package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PointOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.PointOrderVOModel;

import java.util.*;

/**
 * read_23请求类
 * 积分活动读取
 */
public class PointorderReadRequest implements ApiCloudRequest<PointOrderReadDTOModel, PointOrderVOModel> {

    private PointOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pointorder.read";
    }

    @Override
    public PointOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PointOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PointOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PointOrderVOModel>>() {};
    }

}

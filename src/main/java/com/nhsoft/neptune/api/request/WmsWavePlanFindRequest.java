package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WavePlanFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.WavePlanVOModel;

import com.nhsoft.neptune.api.domain.WavePlanVOModel;

import java.util.*;

/**
 * find请求类
 * 查询波次计划单
 */
public class WmsWavePlanFindRequest implements ApiCloudRequest<WavePlanFindDTOModel, List<WavePlanVOModel>> {

    private WavePlanFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.wave.plan.find";
    }

    @Override
    public WavePlanFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WavePlanFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<WavePlanVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<WavePlanVOModel>>>() {};
    }

}

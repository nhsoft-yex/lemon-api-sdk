package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.WavePlanGenerateDTOModel;

import java.util.*;

/**
 * generate请求类
 * 根据时间查询对应的出库单生成波次计划单
 */
public class WmsWavePlanGenerateRequest implements ApiCloudRequest<WavePlanGenerateDTOModel, Void> {

    private WavePlanGenerateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.wms.wave.plan.generate";
    }

    @Override
    public WavePlanGenerateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(WavePlanGenerateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

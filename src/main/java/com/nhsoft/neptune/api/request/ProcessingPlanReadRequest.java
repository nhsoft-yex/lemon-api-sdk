package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingPlanReadDTOModel;

import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import java.util.*;

/**
 * read_24请求类
 * 生产计划单读取
 */
public class ProcessingPlanReadRequest implements ApiCloudRequest<ProcessingPlanReadDTOModel, ProcessingPlanOrderV2DTOModel> {

    private ProcessingPlanReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.plan.read";
    }

    @Override
    public ProcessingPlanReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingPlanReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ProcessingPlanOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ProcessingPlanOrderV2DTOModel>>() {};
    }

}

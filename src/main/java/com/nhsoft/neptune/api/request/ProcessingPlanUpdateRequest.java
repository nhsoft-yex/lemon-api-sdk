package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingPlanUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import java.util.*;

/**
 * update_11请求类
 * 生产计划单更新
 */
public class ProcessingPlanUpdateRequest implements ApiCloudRequest<ProcessingPlanUpdateDTOModel, ProcessingPlanOrderV2DTOModel> {

    private ProcessingPlanUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.plan.update";
    }

    @Override
    public ProcessingPlanUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingPlanUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ProcessingPlanOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ProcessingPlanOrderV2DTOModel>>() {};
    }

}

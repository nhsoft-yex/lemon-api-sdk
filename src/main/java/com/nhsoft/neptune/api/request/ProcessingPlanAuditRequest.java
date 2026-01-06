package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingPlanUpdateDTOModel;

import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import java.util.*;

/**
 * audit_6请求类
 * 生产计划单审核
 */
public class ProcessingPlanAuditRequest implements ApiCloudRequest<ProcessingPlanUpdateDTOModel, ProcessingPlanOrderV2DTOModel> {

    private ProcessingPlanUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.plan.audit";
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

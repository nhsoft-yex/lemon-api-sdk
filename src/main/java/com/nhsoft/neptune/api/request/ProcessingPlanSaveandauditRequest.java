package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingPlanSaveDTOModel;

import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import java.util.*;

/**
 * saveAndAudit_5请求类
 * 生产计划单新增并审核
 */
public class ProcessingPlanSaveandauditRequest implements ApiCloudRequest<ProcessingPlanSaveDTOModel, ProcessingPlanOrderV2DTOModel> {

    private ProcessingPlanSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.plan.saveandaudit";
    }

    @Override
    public ProcessingPlanSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingPlanSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ProcessingPlanOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ProcessingPlanOrderV2DTOModel>>() {};
    }

}

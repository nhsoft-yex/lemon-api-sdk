package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingPlanFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import java.util.*;

/**
 * findProcessingPlanV2请求类
 * 生产计划单查询
 */
public class ProcessingPlanFindv2Request implements ApiCloudRequest<ProcessingPlanFindV2DTOModel, List<ProcessingPlanOrderV2DTOModel>> {

    private ProcessingPlanFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.plan.find/v2";
    }

    @Override
    public ProcessingPlanFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingPlanFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ProcessingPlanOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProcessingPlanOrderV2DTOModel>>>() {};
    }

}

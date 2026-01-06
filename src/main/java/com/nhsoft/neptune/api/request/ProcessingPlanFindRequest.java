package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingPlanFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingPlanOrderV2DTOModel;

import java.util.*;

/**
 * find_33请求类
 * 生产计划单查询
 */
public class ProcessingPlanFindRequest implements ApiCloudRequest<ProcessingPlanFindDTOModel, List<ProcessingPlanOrderV2DTOModel>> {

    private ProcessingPlanFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.plan.find";
    }

    @Override
    public ProcessingPlanFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingPlanFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ProcessingPlanOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProcessingPlanOrderV2DTOModel>>>() {};
    }

}

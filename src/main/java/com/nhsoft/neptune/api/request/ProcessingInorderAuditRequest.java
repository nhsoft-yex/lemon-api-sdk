package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingInOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import java.util.*;

/**
 * auditProcessingInOrder请求类
 * 生产加工单审核
 */
public class ProcessingInorderAuditRequest implements ApiCloudRequest<ProcessingInOrderUpdateV2DTOModel, ProcessingInOrderV2DTOModel> {

    private ProcessingInOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.inorder.audit";
    }

    @Override
    public ProcessingInOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingInOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ProcessingInOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ProcessingInOrderV2DTOModel>>() {};
    }

}

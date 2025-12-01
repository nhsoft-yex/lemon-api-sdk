package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingInOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import java.util.*;

/**
 * updateProcessingInOrder请求类
 * 生产入库单更新
 */
public class ProcessingInorderUpdateRequest implements ApiCloudRequest<ProcessingInOrderUpdateV2DTOModel, ProcessingInOrderV2DTOModel> {

    private ProcessingInOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.inorder.update";
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

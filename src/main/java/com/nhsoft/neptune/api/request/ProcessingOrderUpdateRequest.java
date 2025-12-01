package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingOrderV2DTOModel;

import java.util.*;

/**
 * updateProcessingOrder请求类
 * 生产加工单更新
 */
public class ProcessingOrderUpdateRequest implements ApiCloudRequest<ProcessingOrderUpdateV2DTOModel, ProcessingOrderV2DTOModel> {

    private ProcessingOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.order.update";
    }

    @Override
    public ProcessingOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ProcessingOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ProcessingOrderV2DTOModel>>() {};
    }

}

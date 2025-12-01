package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingOrderReadDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProcessingOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingOrderV2DTOModel;

import java.util.*;

/**
 * readProcessingOrder请求类
 * 生产加工单读取
 */
public class ProcessingOrderReadRequest implements ApiCloudRequest<ProcessingOrderReadDTOModel, List<ProcessingOrderV2DTOModel>> {

    private ProcessingOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.order.read";
    }

    @Override
    public ProcessingOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ProcessingOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProcessingOrderV2DTOModel>>>() {};
    }

}

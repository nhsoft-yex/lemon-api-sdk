package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingOrderV2DTOModel;

import java.util.*;

/**
 * saveProcessingOrder请求类
 * 生产加工单新增
 */
public class ProcessingOrderSaveRequest implements ApiCloudRequest<ProcessingOrderSaveV2DTOModel, ProcessingOrderV2DTOModel> {

    private ProcessingOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.order.save";
    }

    @Override
    public ProcessingOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ProcessingOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ProcessingOrderV2DTOModel>>() {};
    }

}

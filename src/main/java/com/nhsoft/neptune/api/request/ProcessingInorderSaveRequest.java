package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingInOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import java.util.*;

/**
 * saveProcessingInOrder请求类
 * 生产入库单新增
 */
public class ProcessingInorderSaveRequest implements ApiCloudRequest<ProcessingInOrderSaveV2DTOModel, ProcessingInOrderV2DTOModel> {

    private ProcessingInOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.inorder.save";
    }

    @Override
    public ProcessingInOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingInOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ProcessingInOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ProcessingInOrderV2DTOModel>>() {};
    }

}

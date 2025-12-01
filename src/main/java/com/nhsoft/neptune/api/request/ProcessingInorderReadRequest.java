package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ProcessingInOrderReadDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import java.util.*;

/**
 * readProcessingInOrder请求类
 * 生产入库单读取
 */
public class ProcessingInorderReadRequest implements ApiCloudRequest<ProcessingInOrderReadDTOModel, List<ProcessingInOrderV2DTOModel>> {

    private ProcessingInOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.inorder.read";
    }

    @Override
    public ProcessingInOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ProcessingInOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ProcessingInOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProcessingInOrderV2DTOModel>>>() {};
    }

}

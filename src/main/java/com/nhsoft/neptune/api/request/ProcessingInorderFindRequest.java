package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import java.util.*;

/**
 * findProcessingInOrder请求类
 * 生产入库单查询
 */
public class ProcessingInorderFindRequest implements ApiCloudRequest<OrderFindDTOModel, List<ProcessingInOrderV2DTOModel>> {

    private OrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.inorder.find";
    }

    @Override
    public OrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ProcessingInOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProcessingInOrderV2DTOModel>>>() {};
    }

}

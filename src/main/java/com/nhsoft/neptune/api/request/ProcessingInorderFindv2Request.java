package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingInOrderV2DTOModel;

import java.util.*;

/**
 * findProcessingInOrderV2请求类
 * 生产入库单查询
 */
public class ProcessingInorderFindv2Request implements ApiCloudRequest<OrderFindV2DTOModel, List<ProcessingInOrderV2DTOModel>> {

    private OrderFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.inorder.find/v2";
    }

    @Override
    public OrderFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OrderFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ProcessingInOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProcessingInOrderV2DTOModel>>>() {};
    }

}

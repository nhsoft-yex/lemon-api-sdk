package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ProcessingOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.ProcessingOrderV2DTOModel;

import java.util.*;

/**
 * findProcessingOrder请求类
 * 生产加工单查询
 */
public class ProcessingOrderFindRequest implements ApiCloudRequest<OrderFindDTOModel, List<ProcessingOrderV2DTOModel>> {

    private OrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.processing.order.find";
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
    public TypeReference<ApiCloudResponse<List<ProcessingOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ProcessingOrderV2DTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayableOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PayableOrderVOModel;

import com.nhsoft.neptune.api.domain.PayableOrderVOModel;

import java.util.*;

/**
 * findPayableOrder请求类
 * 应付单查询
 */
public class FundPayableOrderFindRequest implements ApiCloudRequest<PayableOrderFindDTOModel, List<PayableOrderVOModel>> {

    private PayableOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payable.order.find";
    }

    @Override
    public PayableOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayableOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PayableOrderVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PayableOrderVOModel>>>() {};
    }

}

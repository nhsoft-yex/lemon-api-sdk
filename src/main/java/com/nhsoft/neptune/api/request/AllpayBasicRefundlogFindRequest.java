package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayLogFindDTOModel;

import java.util.*;

/**
 * findRefundLog请求类
 * 退款日志查询
 */
public class AllpayBasicRefundlogFindRequest implements ApiCloudRequest<PayLogFindDTOModel, Object> {

    private PayLogFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.allpay.basic.refundlog.find";
    }

    @Override
    public PayLogFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayLogFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

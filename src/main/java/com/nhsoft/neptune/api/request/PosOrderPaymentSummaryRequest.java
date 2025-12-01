package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosPaymentSummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosOrderPaymentSummaryVOModel;

import com.nhsoft.neptune.api.domain.PosOrderPaymentSummaryVOModel;

import java.util.*;

/**
 * posOrderPaymentSummary_1请求类
 * 销售付款汇总
 */
public class PosOrderPaymentSummaryRequest implements ApiCloudRequest<PosPaymentSummaryFindDTOModel, List<PosOrderPaymentSummaryVOModel>> {

    private PosPaymentSummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.payment.summary";
    }

    @Override
    public PosPaymentSummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosPaymentSummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosOrderPaymentSummaryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosOrderPaymentSummaryVOModel>>>() {};
    }

}

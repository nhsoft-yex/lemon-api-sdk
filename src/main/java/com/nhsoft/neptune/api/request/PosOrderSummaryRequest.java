package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosSummaryFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PosOrderSummaryVOModel;

import com.nhsoft.neptune.api.domain.PosOrderSummaryVOModel;

import java.util.*;

/**
 * posOrderSummary请求类
 * 销售单据汇总
 */
public class PosOrderSummaryRequest implements ApiCloudRequest<PosSummaryFindDTOModel, List<PosOrderSummaryVOModel>> {

    private PosSummaryFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.summary";
    }

    @Override
    public PosSummaryFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosSummaryFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PosOrderSummaryVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PosOrderSummaryVOModel>>>() {};
    }

}

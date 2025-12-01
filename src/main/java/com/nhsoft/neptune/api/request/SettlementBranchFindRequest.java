package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerSettlementFindRequestDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import java.util.*;

/**
 * findInnerSettlement请求类
 * 门店结算单查询
 */
public class SettlementBranchFindRequest implements ApiCloudRequest<InnerSettlementFindRequestDTOModel, List<InnerSettlementResponseDTOModel>> {

    private InnerSettlementFindRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branch.find";
    }

    @Override
    public InnerSettlementFindRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerSettlementFindRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InnerSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InnerSettlementResponseDTOModel>>>() {};
    }

}

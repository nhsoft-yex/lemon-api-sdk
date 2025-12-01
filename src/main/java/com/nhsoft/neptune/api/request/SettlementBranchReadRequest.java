package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerSettlementReadRequestDTOModel;

import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import java.util.*;

/**
 * readInnerSettlement请求类
 * 门店结算单读取
 */
public class SettlementBranchReadRequest implements ApiCloudRequest<InnerSettlementReadRequestDTOModel, InnerSettlementResponseDTOModel> {

    private InnerSettlementReadRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branch.read";
    }

    @Override
    public InnerSettlementReadRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerSettlementReadRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>>() {};
    }

}

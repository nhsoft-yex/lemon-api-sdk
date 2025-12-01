package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerSettlementUpdateRequestDTOModel;

import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import java.util.*;

/**
 * updateInnerSettlement请求类
 * 门店结算单修改
 */
public class SettlementBranchUpdateRequest implements ApiCloudRequest<InnerSettlementUpdateRequestDTOModel, InnerSettlementResponseDTOModel> {

    private InnerSettlementUpdateRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branch.update";
    }

    @Override
    public InnerSettlementUpdateRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerSettlementUpdateRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>>() {};
    }

}

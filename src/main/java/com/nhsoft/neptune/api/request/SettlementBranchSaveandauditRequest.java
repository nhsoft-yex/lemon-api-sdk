package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerSettlementSaveRequestDTOModel;

import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import java.util.*;

/**
 * saveAndAuditInnerSettlement请求类
 * 门店结算单新增并审核
 */
public class SettlementBranchSaveandauditRequest implements ApiCloudRequest<InnerSettlementSaveRequestDTOModel, InnerSettlementResponseDTOModel> {

    private InnerSettlementSaveRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branch.saveandaudit";
    }

    @Override
    public InnerSettlementSaveRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerSettlementSaveRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerSettlementResponseDTOModel>>() {};
    }

}

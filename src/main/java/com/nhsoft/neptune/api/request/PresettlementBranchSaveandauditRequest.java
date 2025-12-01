package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerPreSettlementSaveRequestDTOModel;

import com.nhsoft.neptune.api.domain.InnerPreSettlementResponseDTOModel;

import java.util.*;

/**
 * saveAndAuditPreInnerSettlement请求类
 * 门店预收单新增并审核
 */
public class PresettlementBranchSaveandauditRequest implements ApiCloudRequest<InnerPreSettlementSaveRequestDTOModel, InnerPreSettlementResponseDTOModel> {

    private InnerPreSettlementSaveRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.branch.saveandaudit";
    }

    @Override
    public InnerPreSettlementSaveRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerPreSettlementSaveRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerPreSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerPreSettlementResponseDTOModel>>() {};
    }

}

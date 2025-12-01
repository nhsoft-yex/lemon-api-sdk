package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerPreSettlementUpdateRequestDTOModel;

import com.nhsoft.neptune.api.domain.InnerPreSettlementResponseDTOModel;

import java.util.*;

/**
 * updatePreInnerSettlement请求类
 * 门店预收单修改
 */
public class PresettlementBranchUpdateRequest implements ApiCloudRequest<InnerPreSettlementUpdateRequestDTOModel, InnerPreSettlementResponseDTOModel> {

    private InnerPreSettlementUpdateRequestDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.branch.update";
    }

    @Override
    public InnerPreSettlementUpdateRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerPreSettlementUpdateRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerPreSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerPreSettlementResponseDTOModel>>() {};
    }

}

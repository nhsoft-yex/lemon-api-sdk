package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerPreSettlementReadRequestDTOModel;

import com.nhsoft.neptune.api.domain.InnerPreSettlementResponseDTOModel;

import java.util.*;

/**
 * readPreInnerSettlement请求类
 * 门店预收单读取
 */
public class PresettlementBranchReadRequest implements ApiCloudRequest<InnerPreSettlementReadRequestDTOModel, InnerPreSettlementResponseDTOModel> {

    private InnerPreSettlementReadRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.branch.read";
    }

    @Override
    public InnerPreSettlementReadRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerPreSettlementReadRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerPreSettlementResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerPreSettlementResponseDTOModel>>() {};
    }

}

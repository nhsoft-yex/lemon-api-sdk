package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerPreSettlementFindRequestDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InnerPreSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.InnerPreSettlementResponseDTOModel;

import java.util.*;

/**
 * findPreInnerSettlement请求类
 * 门店预收单查询
 */
public class PresettlementBranchFindRequest implements ApiCloudRequest<InnerPreSettlementFindRequestDTOModel, List<InnerPreSettlementResponseDTOModel>> {

    private InnerPreSettlementFindRequestDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.branch.find";
    }

    @Override
    public InnerPreSettlementFindRequestDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerPreSettlementFindRequestDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InnerPreSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InnerPreSettlementResponseDTOModel>>>() {};
    }

}

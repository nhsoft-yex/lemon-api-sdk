package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerPreSettlementFindRequestV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InnerPreSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.InnerPreSettlementResponseDTOModel;

import java.util.*;

/**
 * findPreInnerSettlementV2请求类
 * 门店预收单查询
 */
public class PresettlementBranchFindv2Request implements ApiCloudRequest<InnerPreSettlementFindRequestV2DTOModel, List<InnerPreSettlementResponseDTOModel>> {

    private InnerPreSettlementFindRequestV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.presettlement.branch.find/v2";
    }

    @Override
    public InnerPreSettlementFindRequestV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerPreSettlementFindRequestV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InnerPreSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InnerPreSettlementResponseDTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerSettlementFindRequestV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import com.nhsoft.neptune.api.domain.InnerSettlementResponseDTOModel;

import java.util.*;

/**
 * findInnerSettlementV2请求类
 * 门店结算单查询
 */
public class SettlementBranchFindv2Request implements ApiCloudRequest<InnerSettlementFindRequestV2DTOModel, List<InnerSettlementResponseDTOModel>> {

    private InnerSettlementFindRequestV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.settlement.branch.find/v2";
    }

    @Override
    public InnerSettlementFindRequestV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerSettlementFindRequestV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InnerSettlementResponseDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InnerSettlementResponseDTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SettlementTypeFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SettlementTypeVOModel;

import com.nhsoft.neptune.api.domain.SettlementTypeVOModel;

import java.util.*;

/**
 * findSettlementType请求类
 * 结算方式查询
 */
public class FundSettlementTypeFindRequest implements ApiCloudRequest<SettlementTypeFindDTOModel, List<SettlementTypeVOModel>> {

    private SettlementTypeFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.settlement.type.find";
    }

    @Override
    public SettlementTypeFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SettlementTypeFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SettlementTypeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SettlementTypeVOModel>>>() {};
    }

}

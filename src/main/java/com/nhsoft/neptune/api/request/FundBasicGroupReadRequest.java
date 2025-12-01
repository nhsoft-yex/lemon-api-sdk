package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SettlementUnitReadDTOModel;

import com.nhsoft.neptune.api.domain.SettlementUnitGroupVOModel;

import java.util.*;

/**
 * readBasicGroup请求类
 * 组织读取
 */
public class FundBasicGroupReadRequest implements ApiCloudRequest<SettlementUnitReadDTOModel, SettlementUnitGroupVOModel> {

    private SettlementUnitReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.basic.group.read";
    }

    @Override
    public SettlementUnitReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SettlementUnitReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SettlementUnitGroupVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SettlementUnitGroupVOModel>>() {};
    }

}

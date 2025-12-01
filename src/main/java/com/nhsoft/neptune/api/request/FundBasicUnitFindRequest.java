package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SettlementUnitFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SettlementUnitVOModel;

import com.nhsoft.neptune.api.domain.SettlementUnitVOModel;

import java.util.*;

/**
 * findBasicUnit请求类
 * 往来单位查询
 */
public class FundBasicUnitFindRequest implements ApiCloudRequest<SettlementUnitFindDTOModel, List<SettlementUnitVOModel>> {

    private SettlementUnitFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.basic.unit.find";
    }

    @Override
    public SettlementUnitFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SettlementUnitFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SettlementUnitVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SettlementUnitVOModel>>>() {};
    }

}

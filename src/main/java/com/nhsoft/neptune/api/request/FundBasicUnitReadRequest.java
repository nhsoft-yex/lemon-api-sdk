package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SettlementUnitReadDTOModel;

import com.nhsoft.neptune.api.domain.SettlementUnitVOModel;

import java.util.*;

/**
 * readBasicUnit请求类
 * 往来单位读取
 */
public class FundBasicUnitReadRequest implements ApiCloudRequest<SettlementUnitReadDTOModel, SettlementUnitVOModel> {

    private SettlementUnitReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.basic.unit.read";
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
    public TypeReference<ApiCloudResponse<SettlementUnitVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SettlementUnitVOModel>>() {};
    }

}

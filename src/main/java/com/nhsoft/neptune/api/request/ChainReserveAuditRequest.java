package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReserveUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.ReserveOrderFindV2DTOModel;

import java.util.*;

/**
 * reserveAudit请求类
 * 预定活动审核
 */
public class ChainReserveAuditRequest implements ApiCloudRequest<ReserveUpdateV2DTOModel, ReserveOrderFindV2DTOModel> {

    private ReserveUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.reserve.audit";
    }

    @Override
    public ReserveUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReserveUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReserveOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReserveOrderFindV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReserveFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReserveOrderFindV2DTOModel;

import com.nhsoft.neptune.api.domain.ReserveOrderFindV2DTOModel;

import java.util.*;

/**
 * reserveFind请求类
 * 预定活动查询
 */
public class ChainReserveFindRequest implements ApiCloudRequest<ReserveFindV2DTOModel, List<ReserveOrderFindV2DTOModel>> {

    private ReserveFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.reserve.find";
    }

    @Override
    public ReserveFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReserveFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReserveOrderFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReserveOrderFindV2DTOModel>>>() {};
    }

}

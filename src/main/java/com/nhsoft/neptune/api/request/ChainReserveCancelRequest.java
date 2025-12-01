package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReserveCancelV2DTOModel;

import com.nhsoft.neptune.api.domain.ReserveOrderFindV2DTOModel;

import java.util.*;

/**
 * reserveCancel请求类
 * 预定活动作废
 */
public class ChainReserveCancelRequest implements ApiCloudRequest<ReserveCancelV2DTOModel, ReserveOrderFindV2DTOModel> {

    private ReserveCancelV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.reserve.cancel";
    }

    @Override
    public ReserveCancelV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReserveCancelV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReserveOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReserveOrderFindV2DTOModel>>() {};
    }

}

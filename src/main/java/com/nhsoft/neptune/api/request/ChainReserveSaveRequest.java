package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReserveSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.ReserveOrderFindV2DTOModel;

import java.util.*;

/**
 * reserveSave请求类
 * 预定活动新增
 */
public class ChainReserveSaveRequest implements ApiCloudRequest<ReserveSaveV2DTOModel, ReserveOrderFindV2DTOModel> {

    private ReserveSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.reserve.save";
    }

    @Override
    public ReserveSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReserveSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReserveOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReserveOrderFindV2DTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import java.util.*;

/**
 * receiveOrderFind请求类
 * 收货单查询
 */
public class PurchaseReceiveFindRequest implements ApiCloudRequest<ReceiveFindV2DTOModel, List<ReceiveOrderFindV2DTOModel>> {

    private ReceiveFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.receive.find";
    }

    @Override
    public ReceiveFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReceiveOrderFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReceiveOrderFindV2DTOModel>>>() {};
    }

}

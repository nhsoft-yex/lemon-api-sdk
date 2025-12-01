package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import java.util.*;

/**
 * receiveOrderUpdate请求类
 * 收货单修改
 */
public class PurchaseReceiveUpdateRequest implements ApiCloudRequest<ReceiveOrderUpdateV2DTOModel, ReceiveOrderFindV2DTOModel> {

    private ReceiveOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.receive.update";
    }

    @Override
    public ReceiveOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceiveOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceiveOrderFindV2DTOModel>>() {};
    }

}

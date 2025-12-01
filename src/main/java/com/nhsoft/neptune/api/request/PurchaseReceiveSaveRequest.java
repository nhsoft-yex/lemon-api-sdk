package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import java.util.*;

/**
 * receiveOrderSave请求类
 * 收货单新增
 */
public class PurchaseReceiveSaveRequest implements ApiCloudRequest<ReceiveOrderSaveV2DTOModel, ReceiveOrderFindV2DTOModel> {

    private ReceiveOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.receive.save";
    }

    @Override
    public ReceiveOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceiveOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceiveOrderFindV2DTOModel>>() {};
    }

}

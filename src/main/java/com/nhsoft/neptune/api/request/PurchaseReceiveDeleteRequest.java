package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveOrderReadV2DTOModel;

import java.util.*;

/**
 * receiveOrderDelete请求类
 * 收货单删除
 */
public class PurchaseReceiveDeleteRequest implements ApiCloudRequest<ReceiveOrderReadV2DTOModel, Void> {

    private ReceiveOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.receive.delete";
    }

    @Override
    public ReceiveOrderReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveOrderReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

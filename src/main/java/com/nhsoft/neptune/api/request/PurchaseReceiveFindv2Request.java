package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceiveFindV3DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import com.nhsoft.neptune.api.domain.ReceiveOrderFindV2DTOModel;

import java.util.*;

/**
 * receiveOrderFindV2请求类
 * 收货单查询
 */
public class PurchaseReceiveFindv2Request implements ApiCloudRequest<ReceiveFindV3DTOModel, List<ReceiveOrderFindV2DTOModel>> {

    private ReceiveFindV3DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.receive.find/v2";
    }

    @Override
    public ReceiveFindV3DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceiveFindV3DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<ReceiveOrderFindV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<ReceiveOrderFindV2DTOModel>>>() {};
    }

}

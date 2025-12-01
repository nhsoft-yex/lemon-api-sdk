package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseAutoRequestFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseAutoRequestDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseAutoRequestDTOModel;

import java.util.*;

/**
 * findPurchaseAutoRequest请求类
 * 自动补货商品查询
 */
public class PurchaseAutorequestFindRequest implements ApiCloudRequest<PurchaseAutoRequestFindDTOModel, List<PurchaseAutoRequestDTOModel>> {

    private PurchaseAutoRequestFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.autorequest.find";
    }

    @Override
    public PurchaseAutoRequestFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseAutoRequestFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseAutoRequestDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseAutoRequestDTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseStorematrixFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseStorematrixDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseStorematrixDTOModel;

import java.util.*;

/**
 * findPurchaseStoreMatrix请求类
 * 补货参考值查询
 */
public class PurchaseStorematrixFindRequest implements ApiCloudRequest<PurchaseStorematrixFindDTOModel, List<PurchaseStorematrixDTOModel>> {

    private PurchaseStorematrixFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.storematrix.find";
    }

    @Override
    public PurchaseStorematrixFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseStorematrixFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseStorematrixDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseStorematrixDTOModel>>>() {};
    }

}

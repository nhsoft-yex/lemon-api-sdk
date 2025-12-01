package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseAutoRequestSaveDTOModel;

import java.util.*;

/**
 * savePurchaseAutoRequest请求类
 * 自动补货商品保存
 */
public class PurchaseAutorequestSaveRequest implements ApiCloudRequest<PurchaseAutoRequestSaveDTOModel, Void> {

    private PurchaseAutoRequestSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.autorequest.save";
    }

    @Override
    public PurchaseAutoRequestSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseAutoRequestSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

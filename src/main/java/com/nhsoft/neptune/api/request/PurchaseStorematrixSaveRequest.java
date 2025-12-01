package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseStorematrixSaveDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.PurchaseStorematrixDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseStorematrixDTOModel;

import java.util.*;

/**
 * savePurchaseStoreMatrix请求类
 * 补货参考值保存
 */
public class PurchaseStorematrixSaveRequest implements ApiCloudRequest<PurchaseStorematrixSaveDTOModel, List<PurchaseStorematrixDTOModel>> {

    private PurchaseStorematrixSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.storematrix.save";
    }

    @Override
    public PurchaseStorematrixSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseStorematrixSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<PurchaseStorematrixDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PurchaseStorematrixDTOModel>>>() {};
    }

}

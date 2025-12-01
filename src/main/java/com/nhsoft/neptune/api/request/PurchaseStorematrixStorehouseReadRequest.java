package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PurchaseStorematrixReadDTOModel;

import com.nhsoft.neptune.api.domain.PurchaseStorematrixExtDTOModel;

import java.util.*;

/**
 * readPurchaseStoreMatrixByStorehouse请求类
 * 根据仓库读取补货参考值(包含各类单据汇总数据)
 */
public class PurchaseStorematrixStorehouseReadRequest implements ApiCloudRequest<PurchaseStorematrixReadDTOModel, PurchaseStorematrixExtDTOModel> {

    private PurchaseStorematrixReadDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.storematrix.storehouse.read";
    }

    @Override
    public PurchaseStorematrixReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PurchaseStorematrixReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PurchaseStorematrixExtDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PurchaseStorematrixExtDTOModel>>() {};
    }

}

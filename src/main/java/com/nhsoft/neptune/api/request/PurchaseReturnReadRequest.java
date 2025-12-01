package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReturnOrderReadV2DTOModel;

import com.nhsoft.neptune.api.domain.ReturnOrderV2DTOModel;

import java.util.*;

/**
 * returnRead请求类
 * 退货单读取
 */
public class PurchaseReturnReadRequest implements ApiCloudRequest<ReturnOrderReadV2DTOModel, ReturnOrderV2DTOModel> {

    private ReturnOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.return.read";
    }

    @Override
    public ReturnOrderReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReturnOrderReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReturnOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReturnOrderV2DTOModel>>() {};
    }

}

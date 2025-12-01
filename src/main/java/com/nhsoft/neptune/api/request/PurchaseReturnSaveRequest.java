package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReturnOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.ReturnOrderV2DTOModel;

import java.util.*;

/**
 * returnSave请求类
 * 退货单保存
 */
public class PurchaseReturnSaveRequest implements ApiCloudRequest<ReturnOrderSaveV2DTOModel, ReturnOrderV2DTOModel> {

    private ReturnOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.return.save";
    }

    @Override
    public ReturnOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReturnOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReturnOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReturnOrderV2DTOModel>>() {};
    }

}

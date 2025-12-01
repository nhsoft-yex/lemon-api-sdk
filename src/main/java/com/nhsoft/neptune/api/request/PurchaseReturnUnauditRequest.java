package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReturnOrderUnauditDTOModel;

import java.util.*;

/**
 * returnUnaudit请求类
 * 退货单反审核
 */
public class PurchaseReturnUnauditRequest implements ApiCloudRequest<ReturnOrderUnauditDTOModel, Void> {

    private ReturnOrderUnauditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.purchase.return.unaudit";
    }

    @Override
    public ReturnOrderUnauditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReturnOrderUnauditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

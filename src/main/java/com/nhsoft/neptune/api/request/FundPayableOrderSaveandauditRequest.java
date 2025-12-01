package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayableOrderSaveandauditDTOModel;

import com.nhsoft.neptune.api.domain.PayableOrderVOModel;

import java.util.*;

/**
 * saveandauditPayableOrder请求类
 * 应付单新增并审核
 */
public class FundPayableOrderSaveandauditRequest implements ApiCloudRequest<PayableOrderSaveandauditDTOModel, PayableOrderVOModel> {

    private PayableOrderSaveandauditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payable.order.saveandaudit";
    }

    @Override
    public PayableOrderSaveandauditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayableOrderSaveandauditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PayableOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PayableOrderVOModel>>() {};
    }

}

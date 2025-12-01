package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PayableOrderSaveByFeeDTOModel;

import com.nhsoft.neptune.api.domain.PayableOrderVOModel;

import java.util.*;

/**
 * savePayableOrderV2_1请求类
 * 应付单新增(根据费用项目)
 */
public class FundPayableOrderFeeitemSaveRequest implements ApiCloudRequest<PayableOrderSaveByFeeDTOModel, PayableOrderVOModel> {

    private PayableOrderSaveByFeeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.payable.order.feeitem.save";
    }

    @Override
    public PayableOrderSaveByFeeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PayableOrderSaveByFeeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PayableOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PayableOrderVOModel>>() {};
    }

}

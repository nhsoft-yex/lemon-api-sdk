package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.ReceivableOrderSaveByFeeDTOModel;

import com.nhsoft.neptune.api.domain.ReceivableOrderVOModel;

import java.util.*;

/**
 * savePayableOrderV2请求类
 * 应收单新增(根据费用项目)
 */
public class FundReceivableOrderFeeitemSaveRequest implements ApiCloudRequest<ReceivableOrderSaveByFeeDTOModel, ReceivableOrderVOModel> {

    private ReceivableOrderSaveByFeeDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.fund.receivable.order.feeitem.save";
    }

    @Override
    public ReceivableOrderSaveByFeeDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(ReceivableOrderSaveByFeeDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<ReceivableOrderVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<ReceivableOrderVOModel>>() {};
    }

}

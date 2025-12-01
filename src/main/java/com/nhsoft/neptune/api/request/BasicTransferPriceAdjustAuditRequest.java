package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderUpdateDTOModel;

import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import java.util.*;

/**
 * auditTransferPriceAdjust请求类
 * 配送价调整单审核
 */
public class BasicTransferPriceAdjustAuditRequest implements ApiCloudRequest<TransferPriceAdjustOrderUpdateDTOModel, TransferPriceAdjustOrderDTOModel> {

    private TransferPriceAdjustOrderUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.transfer.price.adjust.audit";
    }

    @Override
    public TransferPriceAdjustOrderUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPriceAdjustOrderUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TransferPriceAdjustOrderDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TransferPriceAdjustOrderDTOModel>>() {};
    }

}

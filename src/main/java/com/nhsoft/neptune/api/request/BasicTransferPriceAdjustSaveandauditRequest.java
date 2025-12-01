package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import java.util.*;

/**
 * saveAndAuditTransferPriceAdjust请求类
 * 配送价调整单新增并审核
 */
public class BasicTransferPriceAdjustSaveandauditRequest implements ApiCloudRequest<TransferPriceAdjustOrderSaveDTOModel, TransferPriceAdjustOrderDTOModel> {

    private TransferPriceAdjustOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.transfer.price.adjust.saveandaudit";
    }

    @Override
    public TransferPriceAdjustOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPriceAdjustOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TransferPriceAdjustOrderDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TransferPriceAdjustOrderDTOModel>>() {};
    }

}

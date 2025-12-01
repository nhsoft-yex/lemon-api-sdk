package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderSaveDTOModel;

import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import java.util.*;

/**
 * saveTransferPriceAdjust请求类
 * 配送价调整单新增
 */
public class BasicTransferPriceAdjustSaveRequest implements ApiCloudRequest<TransferPriceAdjustOrderSaveDTOModel, TransferPriceAdjustOrderDTOModel> {

    private TransferPriceAdjustOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.transfer.price.adjust.save";
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

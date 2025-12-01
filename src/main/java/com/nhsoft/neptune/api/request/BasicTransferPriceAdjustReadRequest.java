package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderReadDTOModel;

import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import java.util.*;

/**
 * readTransferPriceAdjust请求类
 * 配送价调整单读取
 */
public class BasicTransferPriceAdjustReadRequest implements ApiCloudRequest<TransferPriceAdjustOrderReadDTOModel, TransferPriceAdjustOrderDTOModel> {

    private TransferPriceAdjustOrderReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.transfer.price.adjust.read";
    }

    @Override
    public TransferPriceAdjustOrderReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPriceAdjustOrderReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TransferPriceAdjustOrderDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TransferPriceAdjustOrderDTOModel>>() {};
    }

}

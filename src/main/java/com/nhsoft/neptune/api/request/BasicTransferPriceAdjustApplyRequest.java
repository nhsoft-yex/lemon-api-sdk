package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderApplyDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import java.util.*;

/**
 * applyTransferPriceAdjust请求类
 * 配送价调整单应用
 */
public class BasicTransferPriceAdjustApplyRequest implements ApiCloudRequest<TransferPriceAdjustOrderApplyDTOModel, List<TransferPriceAdjustOrderDTOModel>> {

    private TransferPriceAdjustOrderApplyDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.transfer.price.adjust.apply";
    }

    @Override
    public TransferPriceAdjustOrderApplyDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPriceAdjustOrderApplyDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TransferPriceAdjustOrderDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TransferPriceAdjustOrderDTOModel>>>() {};
    }

}

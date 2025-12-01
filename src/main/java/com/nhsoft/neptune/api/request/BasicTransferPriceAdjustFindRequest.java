package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import com.nhsoft.neptune.api.domain.TransferPriceAdjustOrderDTOModel;

import java.util.*;

/**
 * findTransferPriceAdjust请求类
 * 配送价调整单查询
 */
public class BasicTransferPriceAdjustFindRequest implements ApiCloudRequest<TransferPriceAdjustOrderFindDTOModel, List<TransferPriceAdjustOrderDTOModel>> {

    private TransferPriceAdjustOrderFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.transfer.price.adjust.find";
    }

    @Override
    public TransferPriceAdjustOrderFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPriceAdjustOrderFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TransferPriceAdjustOrderDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TransferPriceAdjustOrderDTOModel>>>() {};
    }

}

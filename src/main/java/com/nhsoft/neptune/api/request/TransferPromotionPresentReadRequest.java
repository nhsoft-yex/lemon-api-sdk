package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPromotionReadDTOModel;

import com.nhsoft.neptune.api.domain.TransferExcessPresentVOModel;

import java.util.*;

/**
 * readPresent请求类
 * 配送超量赠送读取
 */
public class TransferPromotionPresentReadRequest implements ApiCloudRequest<TransferPromotionReadDTOModel, TransferExcessPresentVOModel> {

    private TransferPromotionReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.transfer.promotion.present.read";
    }

    @Override
    public TransferPromotionReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPromotionReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<TransferExcessPresentVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<TransferExcessPresentVOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.TransferPromotionPresentFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.TransferExcessPresentVOModel;

import com.nhsoft.neptune.api.domain.TransferExcessPresentVOModel;

import java.util.*;

/**
 * findPresent请求类
 * 配送超量赠送查询
 */
public class TransferPromotionPresentFindRequest implements ApiCloudRequest<TransferPromotionPresentFindDTOModel, List<TransferExcessPresentVOModel>> {

    private TransferPromotionPresentFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.transfer.promotion.present.find";
    }

    @Override
    public TransferPromotionPresentFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(TransferPromotionPresentFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<TransferExcessPresentVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<TransferExcessPresentVOModel>>>() {};
    }

}

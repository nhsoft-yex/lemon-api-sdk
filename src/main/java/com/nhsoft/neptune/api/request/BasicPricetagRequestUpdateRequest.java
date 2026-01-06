package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PricetagRequestUpdateDTOModel;

import com.nhsoft.neptune.api.domain.PricetagRequestVOModel;

import java.util.*;

/**
 * update_21请求类
 * 价签申请单更新
 */
public class BasicPricetagRequestUpdateRequest implements ApiCloudRequest<PricetagRequestUpdateDTOModel, PricetagRequestVOModel> {

    private PricetagRequestUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.pricetag.request.update";
    }

    @Override
    public PricetagRequestUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PricetagRequestUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PricetagRequestVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PricetagRequestVOModel>>() {};
    }

}

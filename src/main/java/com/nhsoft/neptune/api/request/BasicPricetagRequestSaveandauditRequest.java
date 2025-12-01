package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PricetagRequestSaveDTOModel;

import com.nhsoft.neptune.api.domain.PricetagRequestVOModel;

import java.util.*;

/**
 * saveAndAudit_7请求类
 * 价签申请单保存并审核
 */
public class BasicPricetagRequestSaveandauditRequest implements ApiCloudRequest<PricetagRequestSaveDTOModel, PricetagRequestVOModel> {

    private PricetagRequestSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.pricetag.request.saveandaudit";
    }

    @Override
    public PricetagRequestSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PricetagRequestSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PricetagRequestVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PricetagRequestVOModel>>() {};
    }

}

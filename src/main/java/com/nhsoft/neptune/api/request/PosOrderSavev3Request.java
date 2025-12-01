package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RetailPosOrderSaveDTOModel;

import java.util.*;

/**
 * posOrderSaveV3请求类
 * 销售单据新增
 */
public class PosOrderSavev3Request implements ApiCloudRequest<RetailPosOrderSaveDTOModel, String> {

    private RetailPosOrderSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.pos.order.save/v3";
    }

    @Override
    public RetailPosOrderSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RetailPosOrderSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<String>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<String>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import java.util.*;

/**
 * saveOutOrderV2请求类
 * 调出单保存
 */
public class ChainOutorderSavev2Request implements ApiCloudRequest<OutOrderSaveV2DTOModel, OutOrderV2DTOModel> {

    private OutOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.save/v2";
    }

    @Override
    public OutOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OutOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OutOrderV2DTOModel>>() {};
    }

}

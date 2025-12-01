package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderReadV2DTOModel;

import com.nhsoft.neptune.api.domain.OutOrderV2DTOModel;

import java.util.*;

/**
 * outorderRead_1请求类
 * 调出单读取
 */
public class ChainOutorderReadRequest implements ApiCloudRequest<OutOrderReadV2DTOModel, OutOrderV2DTOModel> {

    private OutOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.read";
    }

    @Override
    public OutOrderReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OutOrderReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<OutOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<OutOrderV2DTOModel>>() {};
    }

}

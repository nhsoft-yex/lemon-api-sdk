package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.PosClientReadDTOModel;

import com.nhsoft.neptune.api.domain.PosClientVOModel;

import java.util.*;

/**
 * clientRead请求类
 * 客户读取
 */
public class BasicClientReadRequest implements ApiCloudRequest<PosClientReadDTOModel, PosClientVOModel> {

    private PosClientReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.client.read";
    }

    @Override
    public PosClientReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(PosClientReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<PosClientVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<PosClientVOModel>>() {};
    }

}

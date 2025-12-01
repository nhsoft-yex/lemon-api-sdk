package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OutOrderReadV2DTOModel;

import java.util.*;

/**
 * outOrderDelete请求类
 * 调出单删除
 */
public class ChainOutorderDeleteRequest implements ApiCloudRequest<OutOrderReadV2DTOModel, Void> {

    private OutOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.outorder.delete";
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
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

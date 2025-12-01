package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InOrderReadV2DTOModel;

import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import java.util.*;

/**
 * inorderRead请求类
 * 调入单读取
 */
public class ChainInorderReadRequest implements ApiCloudRequest<InOrderReadV2DTOModel, InOrderV2DTOModel> {

    private InOrderReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inorder.read";
    }

    @Override
    public InOrderReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InOrderReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InOrderV2DTOModel>>() {};
    }

}

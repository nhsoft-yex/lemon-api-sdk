package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InOrderFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import java.util.*;

/**
 * InOrderFind请求类
 * 查询调入单
 */
public class ChainInorderFindRequest implements ApiCloudRequest<InOrderFindV2DTOModel, List<InOrderV2DTOModel>> {

    private InOrderFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inorder.find";
    }

    @Override
    public InOrderFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InOrderFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<InOrderV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<InOrderV2DTOModel>>>() {};
    }

}

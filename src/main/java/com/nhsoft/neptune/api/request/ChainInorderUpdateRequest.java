package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InOrderUpdateV2DTOModel;

import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import java.util.*;

/**
 * InOrderUpdate请求类
 * 调入单修改
 */
public class ChainInorderUpdateRequest implements ApiCloudRequest<InOrderUpdateV2DTOModel, InOrderV2DTOModel> {

    private InOrderUpdateV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inorder.update";
    }

    @Override
    public InOrderUpdateV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InOrderUpdateV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InOrderV2DTOModel>>() {};
    }

}

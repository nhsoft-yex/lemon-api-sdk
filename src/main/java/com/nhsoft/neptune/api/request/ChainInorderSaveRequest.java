package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InOrderSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.InOrderV2DTOModel;

import java.util.*;

/**
 * InOrderSave请求类
 * 调入单保存
 */
public class ChainInorderSaveRequest implements ApiCloudRequest<InOrderSaveV2DTOModel, InOrderV2DTOModel> {

    private InOrderSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inorder.save";
    }

    @Override
    public InOrderSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InOrderSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InOrderV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InOrderV2DTOModel>>() {};
    }

}

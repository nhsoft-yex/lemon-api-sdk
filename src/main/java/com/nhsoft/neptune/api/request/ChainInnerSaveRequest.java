package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerSaveV2DTOModel;

import com.nhsoft.neptune.api.domain.InnerOrderFindV2DTOModel;

import java.util.*;

/**
 * innerSave请求类
 * 内部申请单新增
 */
public class ChainInnerSaveRequest implements ApiCloudRequest<InnerSaveV2DTOModel, InnerOrderFindV2DTOModel> {

    private InnerSaveV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.save";
    }

    @Override
    public InnerSaveV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerSaveV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<InnerOrderFindV2DTOModel>>() {};
    }

}

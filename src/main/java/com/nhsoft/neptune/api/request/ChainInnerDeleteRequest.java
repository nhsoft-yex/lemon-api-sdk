package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerReadV2DTOModel;

import java.util.*;

/**
 * innerDelete请求类
 * 内部申请单删除
 */
public class ChainInnerDeleteRequest implements ApiCloudRequest<InnerReadV2DTOModel, Void> {

    private InnerReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.delete";
    }

    @Override
    public InnerReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

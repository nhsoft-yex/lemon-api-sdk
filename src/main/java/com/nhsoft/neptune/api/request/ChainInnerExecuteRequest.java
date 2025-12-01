package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.InnerExecuteV2DTOModel;

import java.util.*;

/**
 * innerExecute请求类
 * 内部申请单执行
 */
public class ChainInnerExecuteRequest implements ApiCloudRequest<InnerExecuteV2DTOModel, Void> {

    private InnerExecuteV2DTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.inner.execute";
    }

    @Override
    public InnerExecuteV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(InnerExecuteV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

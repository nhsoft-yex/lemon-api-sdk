package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestDeleteDTOModel;

import java.util.*;

/**
 * requestDelete请求类
 * 要货单删除
 */
public class ChainRequestDeleteRequest implements ApiCloudRequest<RequestDeleteDTOModel, Void> {

    private RequestDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.chain.request.delete";
    }

    @Override
    public RequestDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

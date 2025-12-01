package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTemplateReadDTOModel;

import com.nhsoft.neptune.api.domain.RequestTemplateResponseDTOModel;

import java.util.*;

/**
 * readRequestTemplate请求类
 * 门店要货模板读取
 */
public class BasicRequestTemplateReadRequest implements ApiCloudRequest<RequestTemplateReadDTOModel, RequestTemplateResponseDTOModel> {

    private RequestTemplateReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.request.template.read";
    }

    @Override
    public RequestTemplateReadDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestTemplateReadDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>>() {};
    }

}

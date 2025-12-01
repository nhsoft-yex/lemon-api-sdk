package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTemplateReadDTOModel;

import com.nhsoft.neptune.api.domain.RequestTemplateResponseDTOModel;

import java.util.*;

/**
 * deleteRequestTemplate请求类
 * 门店要货模板删除
 */
public class BasicRequestTemplateDeleteRequest implements ApiCloudRequest<RequestTemplateReadDTOModel, RequestTemplateResponseDTOModel> {

    private RequestTemplateReadDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.request.template.delete";
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

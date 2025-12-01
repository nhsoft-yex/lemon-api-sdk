package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTemplateUpdateDTOModel;

import com.nhsoft.neptune.api.domain.RequestTemplateResponseDTOModel;

import java.util.*;

/**
 * updateRequestTemplate请求类
 * 门店要货模板修改
 */
public class BasicRequestTemplateUpdateRequest implements ApiCloudRequest<RequestTemplateUpdateDTOModel, RequestTemplateResponseDTOModel> {

    private RequestTemplateUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.request.template.update";
    }

    @Override
    public RequestTemplateUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestTemplateUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>>() {};
    }

}

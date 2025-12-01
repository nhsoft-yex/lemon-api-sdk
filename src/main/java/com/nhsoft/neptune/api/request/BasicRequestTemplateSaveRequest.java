package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTemplateSaveDTOModel;

import com.nhsoft.neptune.api.domain.RequestTemplateResponseDTOModel;

import java.util.*;

/**
 * saveRequestTemplate请求类
 * 门店要货模板新增
 */
public class BasicRequestTemplateSaveRequest implements ApiCloudRequest<RequestTemplateSaveDTOModel, RequestTemplateResponseDTOModel> {

    private RequestTemplateSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.request.template.save";
    }

    @Override
    public RequestTemplateSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestTemplateSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.RequestTemplateFindDTOModel;

import com.nhsoft.neptune.api.domain.RequestTemplateResponseDTOModel;

import java.util.*;

/**
 * findRequestTemplate请求类
 * 门店要货模板查询
 */
public class BasicRequestTemplateFindRequest implements ApiCloudRequest<RequestTemplateFindDTOModel, RequestTemplateResponseDTOModel> {

    private RequestTemplateFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.request.template.find";
    }

    @Override
    public RequestTemplateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(RequestTemplateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<RequestTemplateResponseDTOModel>>() {};
    }

}

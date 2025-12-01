package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SmsBasicTemplateSaveDTOModel;

import java.util.*;

/**
 * saveTemplate请求类
 * 短信模板新增
 */
public class UsercenterMessageTemplateSaveRequest implements ApiCloudRequest<SmsBasicTemplateSaveDTOModel, String> {

    private SmsBasicTemplateSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.message.template.save";
    }

    @Override
    public SmsBasicTemplateSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SmsBasicTemplateSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<String>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<String>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SmsBasicTemplateFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SmsBasicTemplateVOModel;

import com.nhsoft.neptune.api.domain.SmsBasicTemplateVOModel;

import java.util.*;

/**
 * findTemplate请求类
 * 短信模板查询
 */
public class UsercenterMessageTemplateFindRequest implements ApiCloudRequest<SmsBasicTemplateFindDTOModel, List<SmsBasicTemplateVOModel>> {

    private SmsBasicTemplateFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.message.template.find";
    }

    @Override
    public SmsBasicTemplateFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SmsBasicTemplateFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SmsBasicTemplateVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SmsBasicTemplateVOModel>>>() {};
    }

}

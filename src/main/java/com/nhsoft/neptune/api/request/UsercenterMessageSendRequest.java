package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SmsBasicSendByTemplateDTOModel;

import com.nhsoft.neptune.api.domain.SmsBasicMessageVOModel;

import java.util.*;

/**
 * sendMessage请求类
 * 根据模板发送短信
 */
public class UsercenterMessageSendRequest implements ApiCloudRequest<SmsBasicSendByTemplateDTOModel, SmsBasicMessageVOModel> {

    private SmsBasicSendByTemplateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.message.send";
    }

    @Override
    public SmsBasicSendByTemplateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SmsBasicSendByTemplateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SmsBasicMessageVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SmsBasicMessageVOModel>>() {};
    }

}

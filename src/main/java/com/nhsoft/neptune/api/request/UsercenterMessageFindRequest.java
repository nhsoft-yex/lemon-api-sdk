package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SmsBasicMessageFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SmsBasicMessageVOModel;

import com.nhsoft.neptune.api.domain.SmsBasicMessageVOModel;

import java.util.*;

/**
 * findMessage请求类
 * 短信信息查询
 */
public class UsercenterMessageFindRequest implements ApiCloudRequest<SmsBasicMessageFindDTOModel, List<SmsBasicMessageVOModel>> {

    private SmsBasicMessageFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.message.find";
    }

    @Override
    public SmsBasicMessageFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SmsBasicMessageFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SmsBasicMessageVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SmsBasicMessageVOModel>>>() {};
    }

}

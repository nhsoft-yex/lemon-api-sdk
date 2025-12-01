package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.UserBasicAppTypeVOModel;

import com.nhsoft.neptune.api.domain.UserBasicAppTypeVOModel;

import java.util.*;

/**
 * findBasicAppType请求类
 * 开通应用查询
 */
public class UsercenterBasicApptypeFindRequest implements ApiCloudRequest<Void, List<UserBasicAppTypeVOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.apptype.find";
    }

    @Override
    public Void getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(Void bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserBasicAppTypeVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserBasicAppTypeVOModel>>>() {};
    }

}

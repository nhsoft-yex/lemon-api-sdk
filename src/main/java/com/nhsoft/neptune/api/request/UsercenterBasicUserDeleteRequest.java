package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicUserDeleteDTOModel;

import java.util.*;

/**
 * deleteBasicCompanyUser请求类
 * 用户删除
 */
public class UsercenterBasicUserDeleteRequest implements ApiCloudRequest<UserBasicUserDeleteDTOModel, Object> {

    private UserBasicUserDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.user.delete";
    }

    @Override
    public UserBasicUserDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicUserDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

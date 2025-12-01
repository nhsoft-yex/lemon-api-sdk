package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.OpenTokenDTOModel;

import com.nhsoft.neptune.api.domain.UserCenterUserDetailVOModel;

import java.util.*;

/**
 * webUserInfo请求类
 * 用户中心token获取用户信息
 */
public class UsercenterWebUserinfoReadRequest implements ApiCloudRequest<OpenTokenDTOModel, UserCenterUserDetailVOModel> {

    private OpenTokenDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.web.userinfo.read";
    }

    @Override
    public OpenTokenDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(OpenTokenDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserCenterUserDetailVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserCenterUserDetailVOModel>>() {};
    }

}

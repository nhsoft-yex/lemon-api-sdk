package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicRoleFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserBasicRoleVOModel;

import com.nhsoft.neptune.api.domain.UserBasicRoleVOModel;

import java.util.*;

/**
 * readBasicRoles请求类
 * 角色查询
 */
public class UsercenterBasicRoleFindRequest implements ApiCloudRequest<UserBasicRoleFindDTOModel, List<UserBasicRoleVOModel>> {

    private UserBasicRoleFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.role.find";
    }

    @Override
    public UserBasicRoleFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicRoleFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserBasicRoleVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserBasicRoleVOModel>>>() {};
    }

}

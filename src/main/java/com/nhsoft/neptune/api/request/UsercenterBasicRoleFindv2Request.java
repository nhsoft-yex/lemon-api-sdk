package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicRoleFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserBasicRoleFullyVOModel;

import com.nhsoft.neptune.api.domain.UserBasicRoleFullyVOModel;

import java.util.*;

/**
 * findRoles请求类
 * 角色查询(详细信息)
 */
public class UsercenterBasicRoleFindv2Request implements ApiCloudRequest<UserBasicRoleFindDTOModel, List<UserBasicRoleFullyVOModel>> {

    private UserBasicRoleFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.role.find/v2";
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
    public TypeReference<ApiCloudResponse<List<UserBasicRoleFullyVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserBasicRoleFullyVOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SystemRoleFindV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.SystemRoleV2DTOModel;

import com.nhsoft.neptune.api.domain.SystemRoleV2DTOModel;

import java.util.*;

/**
 * systemRoleFind请求类
 * 角色列表查询
 */
public class BasicRoleFindRequest implements ApiCloudRequest<SystemRoleFindV2DTOModel, List<SystemRoleV2DTOModel>> {

    private SystemRoleFindV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.role.find";
    }

    @Override
    public SystemRoleFindV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SystemRoleFindV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<SystemRoleV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<SystemRoleV2DTOModel>>>() {};
    }

}

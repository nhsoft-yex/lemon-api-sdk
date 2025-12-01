package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SystemRoleUpdateDTOModel;

import com.nhsoft.neptune.api.domain.SystemRoleV2DTOModel;

import java.util.*;

/**
 * updateRole请求类
 * 角色修改
 */
public class BasicRoleUpdateRequest implements ApiCloudRequest<SystemRoleUpdateDTOModel, SystemRoleV2DTOModel> {

    private SystemRoleUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.role.update";
    }

    @Override
    public SystemRoleUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SystemRoleUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SystemRoleV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SystemRoleV2DTOModel>>() {};
    }

}

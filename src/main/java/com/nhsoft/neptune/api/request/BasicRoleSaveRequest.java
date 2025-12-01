package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SystemRoleSaveDTOModel;

import com.nhsoft.neptune.api.domain.SystemRoleV2DTOModel;

import java.util.*;

/**
 * saveRole请求类
 * 角色新增
 */
public class BasicRoleSaveRequest implements ApiCloudRequest<SystemRoleSaveDTOModel, SystemRoleV2DTOModel> {

    private SystemRoleSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.role.save";
    }

    @Override
    public SystemRoleSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SystemRoleSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<SystemRoleV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<SystemRoleV2DTOModel>>() {};
    }

}

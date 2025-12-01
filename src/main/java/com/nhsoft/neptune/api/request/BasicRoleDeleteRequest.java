package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.SystemRoleDeleteDTOModel;

import java.util.*;

/**
 * deleteRole请求类
 * 角色删除
 */
public class BasicRoleDeleteRequest implements ApiCloudRequest<SystemRoleDeleteDTOModel, Void> {

    private SystemRoleDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.role.delete";
    }

    @Override
    public SystemRoleDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(SystemRoleDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}

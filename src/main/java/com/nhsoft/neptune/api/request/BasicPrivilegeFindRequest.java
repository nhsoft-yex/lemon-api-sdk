package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import java.util.List;
import com.nhsoft.neptune.api.domain.PrivilegeResourceNewV2DTOModel;

import com.nhsoft.neptune.api.domain.PrivilegeResourceNewV2DTOModel;

import java.util.*;

/**
 * findPrivilege请求类
 * 查询所有权限
 */
public class BasicPrivilegeFindRequest implements ApiCloudRequest<Void, List<PrivilegeResourceNewV2DTOModel>> {

    private Void bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.privilege.find";
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
    public TypeReference<ApiCloudResponse<List<PrivilegeResourceNewV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<PrivilegeResourceNewV2DTOModel>>>() {};
    }

}

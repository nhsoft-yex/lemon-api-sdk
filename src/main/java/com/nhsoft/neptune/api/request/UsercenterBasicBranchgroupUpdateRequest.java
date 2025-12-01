package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicBranchGroupUpdateDTOModel;

import com.nhsoft.neptune.api.domain.UserBasicBranchGroupVOModel;

import java.util.*;

/**
 * updateBasicBranchGroup请求类
 * 门店分组修改
 */
public class UsercenterBasicBranchgroupUpdateRequest implements ApiCloudRequest<UserBasicBranchGroupUpdateDTOModel, UserBasicBranchGroupVOModel> {

    private UserBasicBranchGroupUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.branchgroup.update";
    }

    @Override
    public UserBasicBranchGroupUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicBranchGroupUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserBasicBranchGroupVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserBasicBranchGroupVOModel>>() {};
    }

}

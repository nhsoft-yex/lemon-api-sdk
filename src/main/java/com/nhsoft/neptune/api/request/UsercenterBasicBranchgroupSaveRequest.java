package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicBranchGroupSaveDTOModel;

import com.nhsoft.neptune.api.domain.UserBasicBranchGroupVOModel;

import java.util.*;

/**
 * saveBasicBranchGroup请求类
 * 门店分组保存
 */
public class UsercenterBasicBranchgroupSaveRequest implements ApiCloudRequest<UserBasicBranchGroupSaveDTOModel, UserBasicBranchGroupVOModel> {

    private UserBasicBranchGroupSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.branchgroup.save";
    }

    @Override
    public UserBasicBranchGroupSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicBranchGroupSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<UserBasicBranchGroupVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<UserBasicBranchGroupVOModel>>() {};
    }

}

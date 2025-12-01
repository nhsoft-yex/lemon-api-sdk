package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicBranchGroupFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserBasicBranchGroupVOModel;

import com.nhsoft.neptune.api.domain.UserBasicBranchGroupVOModel;

import java.util.*;

/**
 * findBasicBranchGroup请求类
 * 门店分组查询
 */
public class UsercenterBasicBranchgroupFindRequest implements ApiCloudRequest<UserBasicBranchGroupFindDTOModel, List<UserBasicBranchGroupVOModel>> {

    private UserBasicBranchGroupFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.branchgroup.find";
    }

    @Override
    public UserBasicBranchGroupFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicBranchGroupFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserBasicBranchGroupVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserBasicBranchGroupVOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicBranchFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.UserBasicBranchVOModel;

import com.nhsoft.neptune.api.domain.UserBasicBranchVOModel;

import java.util.*;

/**
 * findBasicBranch请求类
 * 门店查询
 */
public class UsercenterBasicBranchFindRequest implements ApiCloudRequest<UserBasicBranchFindDTOModel, List<UserBasicBranchVOModel>> {

    private UserBasicBranchFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.branch.find";
    }

    @Override
    public UserBasicBranchFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicBranchFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<UserBasicBranchVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<UserBasicBranchVOModel>>>() {};
    }

}

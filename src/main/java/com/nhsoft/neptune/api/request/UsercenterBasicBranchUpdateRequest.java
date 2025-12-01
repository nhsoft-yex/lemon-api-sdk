package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicBranchUpdateDTOModel;

import java.util.*;

/**
 * updateBasicBranch请求类
 * 修改门店档案
 */
public class UsercenterBasicBranchUpdateRequest implements ApiCloudRequest<UserBasicBranchUpdateDTOModel, Object> {

    private UserBasicBranchUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.branch.update";
    }

    @Override
    public UserBasicBranchUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicBranchUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

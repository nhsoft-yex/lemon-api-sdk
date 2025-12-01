package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.UserBasicBranchGroupDeleteDTOModel;

import java.util.*;

/**
 * deleteBasicBranchGroup请求类
 * 门店分组删除
 */
public class UsercenterBasicBranchgroupDeleteRequest implements ApiCloudRequest<UserBasicBranchGroupDeleteDTOModel, Object> {

    private UserBasicBranchGroupDeleteDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.usercenter.basic.branchgroup.delete";
    }

    @Override
    public UserBasicBranchGroupDeleteDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(UserBasicBranchGroupDeleteDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Object>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Object>>() {};
    }

}

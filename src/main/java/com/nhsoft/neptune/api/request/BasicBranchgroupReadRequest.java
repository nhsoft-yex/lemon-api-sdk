package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchgroupReadV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchGroupCenterV2DTOModel;

import java.util.*;

/**
 * branchgroupRead请求类
 * 所属配送中心查询
 */
public class BasicBranchgroupReadRequest implements ApiCloudRequest<BranchgroupReadV2DTOModel, BranchGroupCenterV2DTOModel> {

    private BranchgroupReadV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.branchgroup.read";
    }

    @Override
    public BranchgroupReadV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchgroupReadV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BranchGroupCenterV2DTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BranchGroupCenterV2DTOModel>>() {};
    }

}

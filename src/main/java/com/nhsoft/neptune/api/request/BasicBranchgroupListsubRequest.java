package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchgroupListSubDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchGroupCenterV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchGroupCenterV2DTOModel;

import java.util.*;

/**
 * branchgroupListSub请求类
 * 配送中心下属门店查询
 */
public class BasicBranchgroupListsubRequest implements ApiCloudRequest<BranchgroupListSubDTOModel, List<BranchGroupCenterV2DTOModel>> {

    private BranchgroupListSubDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.basic.branchgroup.listsub";
    }

    @Override
    public BranchgroupListSubDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchgroupListSubDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchGroupCenterV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchGroupCenterV2DTOModel>>>() {};
    }

}

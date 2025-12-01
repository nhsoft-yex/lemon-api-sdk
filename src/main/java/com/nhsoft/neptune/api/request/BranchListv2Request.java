package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchListV2DTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchV2DTOModel;

import java.util.*;

/**
 * branchList请求类
 * 获取所有门店
 */
public class BranchListv2Request implements ApiCloudRequest<BranchListV2DTOModel, List<BranchV2DTOModel>> {

    private BranchListV2DTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.list/v2";
    }

    @Override
    public BranchListV2DTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchListV2DTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchV2DTOModel>>>() {};
    }

}

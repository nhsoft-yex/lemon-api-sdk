package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchV2DTOModel;

import java.util.*;

/**
 * listBranch请求类
 * 获取所有门店
 */
public class BranchListRequest implements ApiCloudRequest<BranchFindDTOModel, List<BranchV2DTOModel>> {

    private BranchFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.list";
    }

    @Override
    public BranchFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchV2DTOModel>>>() {};
    }

}

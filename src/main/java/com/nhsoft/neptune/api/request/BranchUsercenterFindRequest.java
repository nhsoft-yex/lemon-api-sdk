package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchByUsercenterFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchV2DTOModel;

import com.nhsoft.neptune.api.domain.BranchV2DTOModel;

import java.util.*;

/**
 * findUserCenterBranch请求类
 * 根据用户中心门店编码查询门店信息
 */
public class BranchUsercenterFindRequest implements ApiCloudRequest<BranchByUsercenterFindDTOModel, List<BranchV2DTOModel>> {

    private BranchByUsercenterFindDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.usercenter.find";
    }

    @Override
    public BranchByUsercenterFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchByUsercenterFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchV2DTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchV2DTOModel>>>() {};
    }

}

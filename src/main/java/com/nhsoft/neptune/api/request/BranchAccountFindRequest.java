package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchAccountFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchAccountVOModel;

import com.nhsoft.neptune.api.domain.BranchAccountVOModel;

import java.util.*;

/**
 * findBranchAccount请求类
 * 门店账户查询
 */
public class BranchAccountFindRequest implements ApiCloudRequest<BranchAccountFindDTOModel, List<BranchAccountVOModel>> {

    private BranchAccountFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.account.find";
    }

    @Override
    public BranchAccountFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchAccountFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchAccountVOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchAccountVOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchOtherInoutFindDTOModel;

import java.util.List;
import com.nhsoft.neptune.api.domain.BranchOtherInoutDTOModel;

import com.nhsoft.neptune.api.domain.BranchOtherInoutDTOModel;

import java.util.*;

/**
 * branchOtherInoutFind请求类
 * 门店费用单查询
 */
public class OtherinoutBranchFindRequest implements ApiCloudRequest<BranchOtherInoutFindDTOModel, List<BranchOtherInoutDTOModel>> {

    private BranchOtherInoutFindDTOModel bizModel;

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.branch.find";
    }

    @Override
    public BranchOtherInoutFindDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchOtherInoutFindDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<List<BranchOtherInoutDTOModel>>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<List<BranchOtherInoutDTOModel>>>() {};
    }

}

package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchOtherInoutUpdateDTOModel;

import com.nhsoft.neptune.api.domain.BranchOtherInoutDTOModel;

import java.util.*;

/**
 * branchOtherInoutUpdate请求类
 * 门店费用单更新
 */
public class OtherinoutBranchUpdateRequest implements ApiCloudRequest<BranchOtherInoutUpdateDTOModel, BranchOtherInoutDTOModel> {

    private BranchOtherInoutUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.branch.update";
    }

    @Override
    public BranchOtherInoutUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchOtherInoutUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>>() {};
    }

}

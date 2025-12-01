package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchOtherInoutSaveDTOModel;

import com.nhsoft.neptune.api.domain.BranchOtherInoutDTOModel;

import java.util.*;

/**
 * branchOtherInoutSaveAndAudit请求类
 * 门店费用单新增并审核
 */
public class OtherinoutBranchSaveandauditRequest implements ApiCloudRequest<BranchOtherInoutSaveDTOModel, BranchOtherInoutDTOModel> {

    private BranchOtherInoutSaveDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.branch.saveandaudit";
    }

    @Override
    public BranchOtherInoutSaveDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchOtherInoutSaveDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>>() {};
    }

}

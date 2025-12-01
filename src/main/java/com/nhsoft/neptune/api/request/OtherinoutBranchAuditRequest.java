package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchOtherInoutAuditDTOModel;

import com.nhsoft.neptune.api.domain.BranchOtherInoutDTOModel;

import java.util.*;

/**
 * branchOtherInoutAudit请求类
 * 门店费用单审核
 */
public class OtherinoutBranchAuditRequest implements ApiCloudRequest<BranchOtherInoutAuditDTOModel, BranchOtherInoutDTOModel> {

    private BranchOtherInoutAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.otherinout.branch.audit";
    }

    @Override
    public BranchOtherInoutAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchOtherInoutAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<BranchOtherInoutDTOModel>>() {};
    }

}

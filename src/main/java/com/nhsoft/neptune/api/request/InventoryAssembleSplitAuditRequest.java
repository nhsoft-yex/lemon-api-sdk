package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.AssembleSplitAuditDTOModel;

import com.nhsoft.neptune.api.domain.AssembleSplitVOModel;

import java.util.*;

/**
 * auditAssembleSplitOrder请求类
 * 审核组合拆分单
 */
public class InventoryAssembleSplitAuditRequest implements ApiCloudRequest<AssembleSplitAuditDTOModel, AssembleSplitVOModel> {

    private AssembleSplitAuditDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.inventory.assemble.split.audit";
    }

    @Override
    public AssembleSplitAuditDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(AssembleSplitAuditDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<AssembleSplitVOModel>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<AssembleSplitVOModel>>() {};
    }

}

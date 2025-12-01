package com.nhsoft.neptune.api.request;

import com.fasterxml.jackson.core.type.TypeReference;
import com.nhsoft.neptune.ApiCloudRequest;
import com.nhsoft.neptune.ApiCloudResponse;
import com.nhsoft.neptune.api.domain.BranchLabelUpdateDTOModel;

import java.util.*;

/**
 * updateBranchLabel请求类
 * 修改门店标签
 */
public class BranchLabelUpdateRequest implements ApiCloudRequest<BranchLabelUpdateDTOModel, Void> {

    private BranchLabelUpdateDTOModel bizModel;

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String getApiMethodName() {
        return "/nhsoft.amazon.branch.label.update";
    }

    @Override
    public BranchLabelUpdateDTOModel getBizModel() {
        return bizModel;
    }

    @Override
    public void setBizModel(BranchLabelUpdateDTOModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public TypeReference<ApiCloudResponse<Void>> getResponseTypeReference() {
        return new TypeReference<ApiCloudResponse<Void>>() {};
    }

}
